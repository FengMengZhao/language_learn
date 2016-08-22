package org.fmz.autumn;

import java.util.Iterator;

public abstract class ArrayContainer<T> extends Container<T>{
    protected Object[] data;

    protected static final int DEFAULT_CAPACITY = 100;
    
    public ArrayContainer(){
        data = new Object[DEFAULT_CAPACITY];
    }
    
    public ArrayContainer(int init_capacity){
        if(init_capacity < 0)
            data = new Object[DEFAULT_CAPACITY];
        data = new Object[init_capacity];
    }

    @Override
    public void clear(){
        for(int i=0; i<num_items; i++)
            data[i] = null;
        num_items = 0;
    }

    protected int capacity(){
        return data.length;
    }

    
    protected void ensureCapacity(int capacity){
        if(capacity < data.length)
            return;
        Object[] new_data = new Object[capacity];
        for(int i=0; i<num_items; i++)
            new_data[i] = data[i];
        data = new_data;
    }
    

    public boolean isFull(){
        return num_items == data.length;
    }

    @SuppressWarnings("unchecked")
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            private int count = 0;

            public boolean hasNext(){
                return count < num_items;
            }
            public T next(){
                // When you want to get the OuterClass object reference, must use OuterClass.this
                return (T)ArrayContainer.this.data[count++];
                //return (T)data[--count];// this also works, why?
            }
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
}
