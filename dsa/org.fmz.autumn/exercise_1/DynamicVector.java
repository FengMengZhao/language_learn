package org.fmz.autumn;

public class DynamicVector<T> extends Vector<T>{

    public DynamicVector(){}

    public DynamicVector(int initCapacity){ super(initCapacity); }

    public boolean insertAt(int index, T element){
        if(index < 0 || index > numItems)
            return false;
        if(isFull())
            ensureCapacity(data.length << 1);
        safeInsertAt(index, element);
        return true;
    }

}
