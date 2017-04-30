package org.fmz.concurrency;

public class LifeOff implements Runnable{
    private int count_down = 10;
    private static int count = 0;
    private final int id = count++;

    public LifeOff(){}

    public LifeOff(int count_down){
        this.count_down = count_down;
    }

    public String status(){
        return Thread.currentThread().getName() + " " + id + "#" + "(" +
            (count_down > 0 ? count_down : "lifeoff!") + ")";
    }

    public void run(){
        /*
        while(count_down-- > 0){
            System.out.println(status());
            Thread.yield();
        }
        */
        synchronized(this){
            while(count_down-- > 0){
                System.out.println(status());
                Thread.yield();
            }
        }
    }

    public static void main(String args[]){
        LifeOff l = new LifeOff(1000);
        new Thread(l, "t1").start();
        new Thread(l, "t2").start();
        System.out.println("Waiting for LifeOff!");
    }
}
