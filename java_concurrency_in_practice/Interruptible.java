package org.fmz.concurrency;

import java.util.concurrent.locks.*;

public class Interruptible{
    public static void main(String args[]) throws InterruptedException{

        final ReentrantLock l1 = new ReentrantLock();
        final ReentrantLock l2 = new ReentrantLock();

        Thread t1 = new Thread(){
            public void run(){
                try{
                    l1.lockInterruptibly();
                    Thread.sleep(1000);
                    l2.lockInterruptibly();
                }catch(InterruptedException e){
                    System.out.println("t1 interrupted");
                }finally{
                    l2.unlock();
                    l1.unlock();
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                try{
                    l2.lockInterruptibly();
                    Thread.sleep(1000);
                    l1.lockInterruptibly();
                }catch(InterruptedException e){
                    System.out.println("t2 interrupted");
                }finally{
                    l1.unlock();
                    l2.unlock();
                }
            }
        };

        t1.start();
        t2.start();
        t1.interrupt();
        t2.interrupt();
        t1.join();
        t2.join();
   }
}
