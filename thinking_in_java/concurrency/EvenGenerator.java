package org.fmz.concurrency;

public class EvenGenerator extends IntGenerator{
    private int currentEvenValue;
    public int next(){
        ++currentEvenValue;
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String args[]){
        EvenChecker.test(new EvenGenerator(), 10);
    }
}
