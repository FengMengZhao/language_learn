package org.fmz.concurrency;

public class UnsafeSequence{
    private int value;

    public int getValue(){
        return value++;
    }
}
