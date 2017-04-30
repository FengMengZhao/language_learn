package org.fmz.concurrency;

import java.util.concurrent.locks.*;

public class ExplicitLockEvenGenerator extends IntGenerator{
    private int currentEvenValue;
    private Lock lock = new ReentrantLock();
    public int next(){
        lock.lock();
        try{
            ++currentEvenValue;
            Thread.yield();
            ++currentEvenValue;
            return currentEvenValue;
        }finally{
            lock.unlock();
        }
    }

    public static void main(String args[]){
        EvenChecker.test(new ExplicitLockEvenGenerator(), 10);
    }
}
