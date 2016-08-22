package org.fmz.autumn;

public class MaxHeap extends Heap{
    public MaxHeap(){}

    public MaxHeap(int initCapacity){
        super(initCapacity);
    }

    public Comparable peekMax(){
        return peek();
    }

    public Comparable removeMax(){
        return remove();
    }

    public void percolate(){
        int position = size() - 1;
        while(position > 0){
            if(data[position].compareTo(data[parent(position)]) > 0)
                swap(data, position, parent(position));
            position = parent(position);
        }
    }

    public void sift(){
        int position = 0;
        int max_child;
        while((!isLeaf(position)) && rightChild(position) < size()){
            max_child = data[leftChild(position)].compareTo(data[rightChild(position)]) > 0 ?
                leftChild(position) : rightChild(position);
            if(data[position].compareTo(data[max_child]) < 0)
                swap(data, position, max_child);
            position = max_child;
        }
    }
}
