package org.fmz.autumn;

import java.util.Iterator;

public abstract class Heap<T extends Comparable<? super T>> extends ArrayContainer<T>{

    protected Comparable[] data;
    
    public Heap(){
        data = new Comparable[DEFAULT_CAPACITY];
    }

    public Heap(int inint_capacity){
        if(inint_capacity < 0)
            data = new Comparable[DEFAULT_CAPACITY];
        else{
            data = new Comparable[inint_capacity];
        }
    }
    
    // The data has been override, so the method associated data must be override 
    
    @Override
    protected int capacity(){
        return data.length;
    }

    @Override
    public void clear(){
        for(int i = 0; i < num_items; i++)
            data[i] = null;
        num_items = 0;
    }
    
    @SuppressWarnings("unchecked")
    public void contract(){
        if(isFull()){
            return;
        }
        Comparable[] new_data = new Comparable[num_items];
        for(int i = 0; i < new_data.length; i++)
            new_data[i] = (T)data[i];
        data = new_data;// to prevent the wild reference 
    }

    protected boolean isLeaf(int n){
        return (n << 1) + 1 >= num_items;
    }

    protected int leftChild(int n){
        return (n << 1) + 1;
    }

    protected int rightChild(int n){
        return (n << 1) + 2;
    }

    protected int parent(int n){
        return (n - 1) >> 1;
    }

    @SuppressWarnings("unchecked")
    public T peek(){
        if(isEmpty())
            return null;
        return (T)data[0];
    }

    public void insert(T element){
        if(isFull())
            ensureCapacity(num_items << 1);
        data[num_items++] = element;
        percolate();
    }

    @Override
    protected void ensureCapacity(int capacity){
        if(capacity < data.length)
            return;
        Comparable[] new_data = new Comparable[capacity];
        for(int i=0; i<num_items; i++)
            new_data[i] = data[i];
        data = new_data;
    }

    @SuppressWarnings("unchecked")
    public T remove(){
        swap(data, 0, num_items-1);
        T root = (T)data[num_items - 1];
        data[--num_items] = null;
        if(! isEmpty())
          sift();
        return root;
    }

    protected void swap(Comparable[] o, int one, int another){
        Comparable tmp = o[one];
        data[one] = data[another];
        data[another] =tmp;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            int count = 0;
            public boolean hasNext(){
                return count < num_items;
            }

            public T next(){
                return (T)Heap.this.data[count++];
            }

            public void remove(){throw new UnsupportedOperationException();}
        };
    }

    protected abstract void percolate();

    protected abstract void sift();
}
