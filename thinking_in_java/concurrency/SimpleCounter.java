package org.fmz.concurrency;

public class SimpleCounter{
    private int value;

    public int getValue(){
        return value;
    }

    public void setValue(int v){
        value = v;
    }

    public void incrementValue(){
        value++;
    }

    public String toString(){
        return String.valueOf(value);
    }
}
