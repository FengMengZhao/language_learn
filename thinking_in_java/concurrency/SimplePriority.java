package org.fmz.concurrency;

import java.util.concurrent.*;

public class SimplePriority implements Runnable{
    private int count_down = 5;
    private volatile double d;
    
    private int priority;

    public SimplePriority(int priority){
        this.priority = priority;
    }

    public String toString(){
        return Thread.currentThread() + ": " + count_down;
    }

    public void run(){
        Thread.currentThread().setPriority(priority);
        while(true){
            /** 
             * The for loop it to cause the interruput
             * If there is no interrupt, we will not capture the outcome of priority
             */
            for(int i = 1; i < 10000; i++){
                d += (Math.PI + Math.E) / (double)i;
                if(i % 1000 == 0)
                    Thread.yield();
            }
            System.out.println(this);

            if(--count_down == 0){ return; }
            //Thread.yield();
        }
    }

    public static void main(String args[]){
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 5; i++){
            exec.execute(new SimplePriority(Thread.MIN_PRIORITY));
            exec.execute(new SimplePriority(Thread.MAX_PRIORITY));
        }
        exec.shutdown();
    }
}
