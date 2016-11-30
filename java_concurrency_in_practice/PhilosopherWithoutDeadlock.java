package org.fmz.concurrency;

import java.util.*;

public class PhilosopherWithoutDeadlock extends Thread{
    private Chopstick first, 
                      second;
    private Random rnd;

    public PhilosopherWithoutDeadlock(Chopstick lt, Chopstick rt){
        /*
        if(System.identityHashCode(lt) < System.identityHashCode(rt)){
            first = lt;
            second = rt;
        }else{
            first= rt;
            second = lt;
        }
        */
        if(lt.getId() < rt.getId()){
            first = lt;
            second = rt;
        }else{
            first= rt;
            second = lt;
        }
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
