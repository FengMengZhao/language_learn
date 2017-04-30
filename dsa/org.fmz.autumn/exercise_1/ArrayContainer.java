package org.fmz.autumn;

import java.util.Iterator;

public abstract class ArrayContainer<T> extends Container<T>{

    protected Object[] data;

    protected static final int DEFAULT_CAPACITY = 100;

    public ArrayContainer(){
        data = new Object[DEFAULT_CAPACITY];
    }

    public void clear(){
        for(int i = 0; i < numItems; i++)
            data[i] = null;
    }

    public int capacity(){
        return data.length;
    }

    public boolean isFull(){
        return numItems == data.length;
    }

    protected void ensureCapacity(int capacity){
        if(capacity <= numItems)
            return;
        Object[] newData = new Object[capacity];
        for(int i = 0; i < numItems; i++)
            newData[i] = data[i];
        data = newData;
    }
    @SuppressWarnings("unchecked")
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            private int count = 0;

            public boolean hasNext(){
                return count < numItems;
            }

            public T next(){
                return (T)data[count++];
            }
        };
    }
}
