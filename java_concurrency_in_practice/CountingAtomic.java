package org.fmz.concurrency;

import java.util.*;
import java.util.concurrent.atomic.*;

public class CountingAtomic{
    public static void main(String args[]) throws InterruptedException{
        final AtomicInteger counter = new AtomicInteger();

        class CountingThread extends Thread{
            public void run(){
                for(int x = 0; x < 10000; x++)
                    counter.incrementAndGet();
            }
        }

        List<Thread> ls = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            ls.add(new CountingThread());
        for(Thread t : ls){
            t.start();
            t.join();
        }
        /*
        CountingThread t1 = new CountingThread();
        CountingThread t2 = new CountingThread();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        */
        System.out.println(counter.get());
    }
}
