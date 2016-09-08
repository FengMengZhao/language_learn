package org.fmz.autumn;

public class MinHeap<T> extends Heap<T>{
    
    public T removeMin(){
        return remove();
    }

    public T peekMin(){
        return peek();
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void percolate(){
        int pos = numItems - 1;
        while(pos > 0){
            if(((Comparable)data[pos]).compareTo(data[parent(pos)]) < 0){
                swap(data, pos, parent(pos));
                pos = parent(pos);
            }else
                break;
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void sift(){
        int pos = 0;
        int min_index = 0;
        /*
        while((! isLeaf(pos)) && rightChild(pos) < numItems){

            min_index = ((Comparable)data[leftChild(pos)]).compareTo((Comparable)data[rightChild(pos)]) < 0
                                    ? leftChild(pos)
                                    : rightChild(pos);
            if(((Comparable)data[pos]).compareTo(data[min_index]) > 0){
                swap(data, pos, min_index);
                pos = min_index;
            }else
                break;
        }
        */
        while((! isLeaf(pos))){
            if(! (rightChild(pos) < numItems))
                min_index = leftChild(pos);
            else
                min_index = ((Comparable)data[leftChild(pos)]).compareTo((Comparable)data[rightChild(pos)]) < 0
                                    ? leftChild(pos)
                                    : rightChild(pos);
            if(((Comparable)data[pos]).compareTo(data[min_index]) > 0){
                swap(data, pos, min_index);
                pos = min_index;
            }else
                break;
        }
    }
}
