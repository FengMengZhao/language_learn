package org.fmz.concurrency;

public class SynchronizedEvenGenerator extends IntGenerator{
    private int currentEvenValue;
    public synchronized int next(){
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String args[]){
        EvenChecker.test(new SynchronizedEvenGenerator(), 10);
    }
}
