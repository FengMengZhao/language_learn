package org.fmz.autumn;

public class MinHeap<T extends Comparable<? super T>> extends Heap<T>{

    @Override
    @SuppressWarnings("unchecked")
    protected void percolate(){
        int pos = num_items - 1;
        while(pos > 0){
            if(data[pos].compareTo(data[parent(pos)]) < 0){
                swap(data, pos, parent(pos));
                pos = parent(pos);
            }else break;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void sift(){
        int pos = 0;
        int extreme = 0;
        while((!isLeaf(pos)) && rightChild(pos) < num_items){
            extreme = data[leftChild(pos)].compareTo(data[rightChild(pos)]) < 0 ?
                leftChild(pos) : rightChild(pos);
            if(data[pos].compareTo(data[extreme]) > 0){
                swap(data, pos, extreme);
                pos = extreme;
            }else break;
        }
    }
}
