package org.fmz.autumn;

public abstract class Container{
    protected int num_items = 0;

    public boolean isEmpty(){
        return num_items == 0;
    }

    public int size(){
        return num_items;
    }

    public abstract void clear();
}
