package org.fmz.concurrency;

import java.util.concurrent.*;

public class MoreBasicThreadsStartSameTime{
    public static void main(String args[]){
        CountDownLatch latch = new CountDownLatch(7);
        for(int i = 0; i < 7; i++){
            new Thread(new LifeOffCountDownLatch(latch, 4)).start();
            latch.countDown();
        }
        System.out.println("Waiting for LifeOff!");
    }
}
