package org.fmz.autumn;

import java.util.Iterator;

public abstract class Heap<T extends Comparable<T>> extends ArrayContainer<T>{
    public Heap(){}

    public Heap(int initCapacity){
        super(initCapacity);
    }

    public int parent(int n){
        return (n - 1) >> 1;
    }

    public int leftChild(int n){
        return (n << 1) + 1;
    }

    public int rightChild(int n){
        return (n << 1) + 2;
    }

    public boolean isLeaf(int n){
        return (n << 1) + 1 > numItems - 1;
    }

    public void insert(T element){
        if(isFull()){
            Object[] new_data = new Object[numItems << 1];
            for(int i = 0; i < numItems; i++)
                new_data[i] = data[i];
            data = new_data;
        }
        data[numItems++] = element;
        percolate();
    }

    @SuppressWarnings("unchecked")
    public T remove(){
        if(isEmpty())
            return null;
        T res = (T)data[0];
        data[0] = data[numItems - 1];
        data[--numItems] = null;
        sift();
        return res;
    }

    @SuppressWarnings("unchecked")
    public T peek(){
        if(isEmpty())
            return null;
        return (T)data[0];
    }

    public abstract void percolate();

    public abstract void sift();

    @SuppressWarnings("unchecked")
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            public boolean hasNext(){
                return numItems >= 0;
            }
            int count = 0;
            public T next(){
                return (T)Heap.this.data[count++];
            }

            public void remove(){
                throw new UnsupportedOperationException();
            } 
        };
    }
}
