package org.fmz.concurrency;

import java.util.*;
import java.util.concurrent.locks.*;

public class PrinterQueue{
    private final Lock queueLock= new ReentrantLock();
    
    public void printJob(Object document){
        queueLock.lock();
        try{
            Long duration = (long)(Math.random() * 10000);
            System.out.println(Thread.currentThread().getName() 
                    + ": PrintQueue: Printing a Job during " 
                    + (duration / 1000) 
                    + " seconds :: Time - " 
                    + new Date());
            Thread.sleep(duration);
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally{
            System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
            queueLock.unlock();
        }
    }

    /*
    public synchronized void printJob(Object document){
        try{
            Long duration = (long)(Math.random() * 10000);
            System.out.println(Thread.currentThread().getName() 
                    + ": PrintQueue: Printing a Job during " 
                    + (duration / 1000) 
                    + " seconds :: Time - " 
                    + new Date());
            Thread.sleep(duration);
            System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    */
}
