package org.fmz.autumn;

import java.util.Iterator;

public abstract class Container<T> implements Iterable<T>{
    protected int num_items = 0;

    public abstract void clear();

    public abstract Iterator<T> iterator();

    public int size(){
        return num_items;
    }

    public boolean isEmpty(){
        return num_items == 0;
    }

}
