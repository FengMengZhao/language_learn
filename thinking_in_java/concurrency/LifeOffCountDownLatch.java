package org.fmz.concurrency;

import java.util.concurrent.*;

public class LifeOffCountDownLatch implements Runnable{
    private int count_down = 10;
    private static int count = 0;
    private final int id = count++;
    private CountDownLatch latch;

    public LifeOffCountDownLatch(CountDownLatch latch){
        this.latch = latch;
    }

    public LifeOffCountDownLatch(CountDownLatch latch, int count_down){
        this(latch);
        this.count_down = count_down;
    }

    public String status(){
        return id + "#" + "(" +
            (count_down > 0 ? count_down : "lifeoff!") + ")";
    }

    public void run(){
        try{
            latch.await();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        while(count_down-- > 0){
            System.out.println(status());
            Thread.yield();
        }
    }

    public static void main(String args[]){
        LifeOff lo = new LifeOff();
        lo.run();
    }
}
