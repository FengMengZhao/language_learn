package org.fmz.autumn;

public class MaxHeap<T extends Comparable<T>> extends Heap<T>{
    public MaxHeap(){}

    public MaxHeap(int initCapacity){
        super(initCapacity);
    }

    public T peekMax(){
        return peek();
    }

    public T removeMax(){
        return remove();
    }

    @SuppressWarnings("unchecked")
    public void percolate(){
        int pos = numItems - 1;
        while(pos > 0){
            if(((Comparable)data[pos]).compareTo((Comparable)data[parent(pos)]) > 0){
                Object tmp = data[pos];
                data[pos] = data[parent(pos)];
                data[parent(pos)] = tmp;
                pos = parent(pos);
            }else break;
        }
    }

    @SuppressWarnings("unchecked")
    public void sift(){
        int pos = 0,
            min = 0;

        while(! isLeaf(pos)){
            if(rightChild(pos) > numItems - 1)
                min = leftChild(pos);
            else
                min = ((Comparable)data[leftChild(pos)]).compareTo((Comparable)data[rightChild(pos)]) > 0
                                                                                        ? leftChild(pos)
                                                                                        : rightChild(pos);
            if(((Comparable)data[pos]).compareTo((Comparable)data[min]) < 0){
                Object tmp = data[pos];
                data[pos] = data[min];
                data[min] = tmp;
                pos = min;
            }else break;
        }
    }
}
