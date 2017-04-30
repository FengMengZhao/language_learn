package org.fmz.autumn;

public abstract class Heap<T> extends ArrayContainer<T>{

    protected int parent(int n){ return (n - 1) >> 1; }

    protected int leftChild(int n){ return (n << 1) + 1; }

    protected int rightChild(int n){ return (n << 1) + 2; }

    protected boolean isLeaf(int n){ return leftChild(n) > numItems -1; }

    protected void swap(Object[] arr, int one, int another){
        Object tmp = arr[one];
        arr[one] = arr[another];
        arr[another] = tmp;
    }


    public void insert(T element){
        if(isFull())
            ensureCapacity(data.length << 1);
        data[numItems++] = element;
        percolate();
    }

    @SuppressWarnings("unchecked")
    protected T peek(){
        if(isEmpty())
            return null;
        return (T)data[0];
    }

    @SuppressWarnings("unchecked")
    protected T remove(){
        if(isEmpty())
            return null;
        swap(data, 0, numItems - 1);
        T res = (T)data[numItems - 1];
        data[--numItems] = null;
        if(size() != 0)
            sift();
        return res;
    }

    protected abstract void percolate();

    protected abstract void sift();
}
