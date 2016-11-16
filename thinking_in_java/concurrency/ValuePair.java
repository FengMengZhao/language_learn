package org.fmz.concurrency;

public class ValuePair{
    private int a;
    private int b;

    /*
    public synchronized void copy(ValuePair other){
        a = other.a;
        b = other.b;
    }
    */
    public synchronized void copy(ValuePair other){
        synchronized(other){
            b = other.b;
            a = other.a;
        }
    }

    public synchronized void setValue(int value){
        a = value;
        b = value;
    }

    public synchronized String toString(){
        return String.format("a: %d and b: %d", a, b);
    }
}
