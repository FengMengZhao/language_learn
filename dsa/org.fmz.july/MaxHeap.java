package org.fmz.july;

public class MaxHeap extends AbstractHeap{

    public MaxHeap(){
        super();
    }

    public MaxHeap(int initCapacity){
        super(initCapacity);
    }

    @Override
    protected void percolate(){
        int cursor = size() - 1;
        while(cursor > 0){
            if(elements[parent(cursor)].compareTo(elements[cursor]) < 0){
                swap(elements, parent(cursor), cursor);
            }
            cursor = parent(cursor);
        }
    }

    @Override
    protected void sift(){
        int cursor = 0;
        int leftChild, rightChild;
        while(!isLeaf(cursor)){
            leftChild = leftChild(cursor);
            rightChild = rightChild(cursor);
            if(rightChild < numItems && elements[leftChild].compareTo(elements[rightChild]) < 0){
                leftChild = rightChild;
            }
            if(elements[leftChild].compareTo(elements[cursor]) > 0){
                swap(elements, leftChild, cursor);
                cursor = leftChild;
            }else{
                break;
            }
        }
    }
}
