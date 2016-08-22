package org.fmz.autumn;

public abstract class Heap extends ArrayContainer{

    protected Comparable[] data; // override the field
    // after the override field, the method must be override
    public Heap(){
        data = new Comparable[DEFAULT_CAPACITY];
    }

    // after the override field, the method must be override
    public Heap(int initCapacity){
        if(initCapacity < 0)
            data = new Comparable[DEFAULT_CAPACITY];
        else{
            data = new Comparable[initCapacity];
        }
    }

    // after the override field, the method must be override
    public int capacity(){
        return data.length;
    }

    // after the override field, the method must be override
    public void clear(){
        for(int i=0; i<num_items; i++)
            data[i] = null;
        num_items = 0;
    }


    public void contract(){
        if(isFull())
            return;
        Comparable[] new_data = new Comparable[num_items];
        for(int i=0; i<new_data.length; i++)
            new_data[i] = data[i];
        data = new_data;
    }

    public void insert(Comparable element){
        if(isFull()){
            Comparable[] new_data = new Comparable[num_items * 2];
            for(int i=0; i<num_items; i++)
                new_data[i] = data[i];
            data = new_data;
        }
        data[num_items++] = element;
        percolate();
    }

    protected boolean isLeaf(int index){
        return 2 * index + 1 >= num_items;
    }

    protected int leftChild(int index){
        if(index < 0)
            return -1;
        return 2 * index + 1;
    }

    protected int rightChild(int index){
        if(index < 0)
            return -1;
        return 2 * index + 2;
    }

    protected int parent(int index){
        if(index < 1)
            return -1;
        return (index - 1) / 2;
    }

    protected Comparable peek(){
        if(isEmpty())
            return null;
        return data[0];
    }

    protected Comparable remove(){
        Comparable res = data[0];
        swap(data, 0, size()-1);
        data[--num_items] = null;
        if(size() != 0)
            sift();
        return res;
    }

    protected void swap(Comparable[] array, int one, int another){
        Comparable temp = array[one];
        array[one] = array[another];
        array[another] = temp;
    }

    protected abstract void percolate();

    protected abstract void sift();
}
