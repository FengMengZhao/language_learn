package org.fmz.concurrency;

public class ImmutableValue{
    private final int value;

    public ImmutableValue(int v){
        value = v;
    }

    public int getValue(){
        return value;
    }

    public ImmutableValue add(int valueToAdd){
        return new ImmutableValue(value + valueToAdd);
    }
}

