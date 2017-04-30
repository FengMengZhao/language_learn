package org.fmz.concurrency;

import java.util.*;

public class Philosopher extends Thread{
    private Chopstick left, 
                      right;
    private Random rnd;

    public Philosopher(Chopstick lt, Chopstick rt){
        left = lt;
        right = rt;
        rnd = new Random();
    }

    public void run(){
        try{
            while(true){
                Thread.sleep(rnd.nextInt(1000));// Think for a while
                synchronized(left){// Grab left chopstic
                    synchronized(right){// Grab right chopstic
                        Thread.sleep(rnd.nextInt(1000));// Eat for a while
                    }
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
