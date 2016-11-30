package org.fmz.concurrency;

public class PhilosopherConditionVariable extends Thread{
    private boolean eating;
    private PhilosopherConditionVariable left;
    private PhilosopherConditionVariable right;
    private ReentrantLock table;
    private Condition condition;
    private Random random;

    public PhilosopherConditionVariable(ReentrantLock tb){
        eating = false;
        table = tb;
        condition = tb.newCondition();
        random = new Random();
    }

    public void setLeft(PhilosopherConditionVariable lt){
        left = lt;
    }

    public void setRight(PhilosopherConditionVariable rt){
        right = rt;
    }

    public void run(){
        try{
            while(true){
                think();
                eat();
            }
        }catch(InterruptedException e){}
    }

    public void think() throws InterruptedException{
        table.lock();// lock the whole table
        try{
            eating = false;// finished eating
            left.condition.signal();// inform the left neighbour who can try to eat
            right.condition.signal();// inform the right neighbour who can try to eat
        }finally{ table.unlock(); }
        Thread.sleep(100);// thinking for a while
    }

    public void eat() throws InterruptedException{
        table.lock();// lock the whole table
        try{
            while(left.eating || right.eating)// check the neighbours whether eating
                condition.await();// if either is eating, unlock the table 
            eating = true;// eating and release the table
        }finally{ table.unlock(); }
        Thread.sleep(100);
    }
}
