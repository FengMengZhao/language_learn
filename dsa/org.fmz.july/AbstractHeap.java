package org.fmz.july;

public abstract class AbstractHeap{

    protected static final int DEFAULT_CAPACITY = 100;
    protected Comparable[] elements;
    protected int numItems;

    public AbstractHeap(){
        elements = new Comparable[DEFAULT_CAPACITY];
    }
    
    public AbstractHeap(int initCapacity){
        if(initCapacity <= 0){
            elements = new Comparable[DEFAULT_CAPACITY];
        }else{
            elements = new Comparable[initCapacity];
        }
    }

    public void clear(){
        for(int i = 0; i < numItems; i++){
            elements[i] = null;
        }
        numItems = 0;
    }

    public void contract(){
        if(numItems == elements.length){
            return;
        }
        Comparable[] newElements = new Comparable[numItems];
        for(int i = 0; i < numItems; i++){
            newElements[i] = elements[i];
        }
        elements = newElements;
        newElements = null;
    }

    public void insert(Comparable element){
        if(isFull()){
            Comparable[] newElements = new Comparable[numItems * 2];
            for(int i = 0; i < numItems; i++){
                newElements[i] = elements[i];
            }
            elements = newElements;
            newElements = null;
        }
        elements[numItems++] = element;
        percolate();
    }

    protected abstract void percolate();

    public boolean isFull(){
        return numItems == elements.length; 
    }

    public boolean isEmpty(){
        return numItems == 0;
    }

    protected boolean isLeaf(int pos){
        return (pos << 1) + 1 > numItems - 1;
    }

    protected int leftChild(int pos){
        if(pos < 0){
            return  -1;
        }
        return (pos << 1) + 1; 
    }

    protected int rightChild(int pos){
        if(pos < 0){
            return -1;
        }
        return (pos << 1) + 2;
    }

    protected int parent(int pos){
        if(pos < 1){
            return -1;
        }
        return (pos - 1) >> 1;
    }

    protected Comparable peek(){
        if(isEmpty()){
            return null;
        }
        return elements[0];
    }

    protected Comparable remove(){
        if(isEmpty()){
            return null;
        }
        swap(elements, 0, numItems - 1);
        Comparable result = elements[numItems - 1];
        elements[--numItems] = null;
        if(numItems != 0){
            sift();
        }
        return result;
    }

    protected abstract void sift();

    protected void swap(Comparable[] arr, int one, int another){
        Comparable tmp = arr[one];
        arr[one] = arr[another];
        arr[another] = tmp;
    }

    public int size(){
        return numItems;
    }
}
