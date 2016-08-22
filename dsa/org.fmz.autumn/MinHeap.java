package org.fmz.autumn;

public class MinHeap extends Heap{
    public MinHeap(){}

    public MinHeap(int initCapacity){
        super(initCapacity);
    }

    public Comparable peekMin(){
        return peek();
    }

    public Comparable removeMin(){
        return remove();
    }

    public void percolate(){
        int position = num_items - 1;
        while(position > 0){
            if(data[position].compareTo(data[parent(position)]) < 0)
                swap(data, position, parent(position));
            position = parent(position);
        }
    }

    public void sift(){
        int position = 0;
        int min_child;
        while((!isLeaf(position)) && rightChild(position) < num_items){
            min_child = data[leftChild(position)].compareTo(data[rightChild(position)]) < 0 ?
                leftChild(position) : rightChild(position);
            if(data[position].compareTo(data[min_child]) > 0 )
                swap(data, position, min_child);
            position = min_child;
        }
    }
}
