package org.fmz.autumn;

public abstract class ArrayContainer extends Container{
    protected Object[] data; 
    protected final int DEFAULT_CAPACITY = 100;

    public ArrayContainer(){
        data = new Object[DEFAULT_CAPACITY];
    }

    public int capacity(){
        return data.length;
    }
    public void clear(){
        for(int i = 0; i < num_items; i++)
            data[i] = null;
        num_items = 0;
    }
    public boolean isFull(){
        return num_items == capacity();
    }
}
