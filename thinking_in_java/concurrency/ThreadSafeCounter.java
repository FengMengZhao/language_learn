package org.fmz.concurrency;

public class ThreadSafeCounter{
    private int value;

    public synchronized int getValue(){
        return value;
    }

    public synchronized void setValue(int v){
        value = v;
    }

    public synchronized void incrementValue(){
        value++;
    }

    public String toString(){
        return String.valueOf(value);
    }
}
