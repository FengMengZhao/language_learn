package org.fmz.autumn;

public abstract class ArrayContainer<T> extends Container<T>{
    protected final int DEFAULT_CAPACITY = 100;
    protected Object[] data;

    public ArrayContainer(){
        data = new Object[DEFAULT_CAPACITY];
    }

    public ArrayContainer(int initCapacity){
        if(initCapacity < 0)
            data = new Object[DEFAULT_CAPACITY];
        else
            data = new Object[initCapacity];
    }

    public int capacity(){
        return data.length;
    }

    public void clear(){
        for(int i = 0; i < numItems; i++)
            data[i] = null;
        numItems = 0;
    }

    public boolean isFull(){
        return numItems == data.length;
    }
}
