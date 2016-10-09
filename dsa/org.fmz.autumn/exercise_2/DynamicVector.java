package org.fmz.autumn;

public class DynamicVector<T> extends Vector<T>{

    public DynamicVector(){}

    public DynamicVector(int initCapacity){
        super(initCapacity);
    }

    protected void ensureCapacity(int capacity){
        if(capacity <= numItems) return;
        Object[] newData = new Object[capacity];
        for(int i = 0; i < numItems; i++)
            newData[i] = data[i];
        data = newData;
    }

    public boolean append(T element){
        if(isFull())
            ensureCapacity(numItems << 1);

        data[numItems++] = element;
        return true;
    }

    public boolean insertAt(int index, T element){
        if(isFull())
            ensureCapacity(numItems << 1);

        for(int i = numItems; i > index; i--)
            data[i] = data[i - 1];
        data[index] = element;
        numItems++;
        return true;
    }
}
