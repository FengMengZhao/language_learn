package org.fmz.autumn;

public class FixedVector<T> extends Vector<T>{

    public FixedVector(){}

    public FixedVector(int initCapacity){ super(initCapacity); }

    public boolean insertAt(int index, T element){
        if(isFull() || index < 0 || index > numItems)
            return false;
        safeInsertAt(index, element);
        return true;
    }
} 
