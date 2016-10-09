package org.fmz.autumn;

public class FixedVector<T> extends Vector<T>{
    public FixedVector(){}

    public FixedVector(int initCapacity){
        super(initCapacity);
    }

    public boolean append(T element){
        if(isFull())
            return false;
        data[numItems++] = element; 
        return true;
    } 

    public boolean insertAt(int index, T element){
        if(isFull() || index > numItems)
            return false;

        for(int i = numItems; i > index; i--)
            data[i] = data[i - 1];
        data[index] = element;
        return true;
    }
}
