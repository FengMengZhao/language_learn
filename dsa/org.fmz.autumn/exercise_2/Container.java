package org.fmz.autumn;

import java.util.Iterator;

public abstract class Container<T> implements Iterable<T>{
    protected int numItems;

    public boolean isEmpty(){
        return numItems == 0;
    }

    public int size(){
        return numItems;
    }

    public abstract Iterator<T> iterator();

    public abstract void clear();
}
