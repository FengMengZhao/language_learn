package org.fmz.concurrency;

import java.util.concurrent.*;

public class PhilosopherTimeout extends Thread{
    private ReentrantLock leftChopstick, 
                          rightChopstick;
    private Random rnd;

    public PhilosopherTimeout(ReentrantLock ltChopstic, ReentrantLock rtChopstic){
        leftChopstick = ltChopstic;
        rightChopstick = rtChopstic;
        rnd = new Random();
    }

    public void run(){
        try{
            while(true){
                Thread.sleep(rnd.nextInt(1000));// Think for a while
                leftChopstick.lock();
                try{
                    if(rightChopstick.tryLock(1000, TimeUnit.MILLISECONDS)){
                        // Got the right chopstick
                        try{
                            Thread.sleep(rnd.nextInt(1000));// Eat for a while
                        }finally{
                            rightChopstick.unlock();
                        }
                    }else {
                        // Don't get the right chopstick - give up and go back to thinking
                    }
                }finally{
                    leftChopstick.unlock();
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
