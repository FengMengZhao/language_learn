package org.fmz.autumn;

public class DynamicVector<T> extends Vector<T>{

    public DynamicVector(){}

    public DynamicVector(int initCapacity){
        super(initCapacity);
    }

    @Override
    public boolean append(T element){
        if(isFull())
            ensureCapacity(data.length * 2);
        data[num_items++] = element;
        return true;
    }

    @Override
    public boolean insertAt(int index, T element){
        if(index < 0 || index >= num_items)
            return false;
        if(isFull())
            ensureCapacity(data.length * 2);
        for(int i = num_items; i > index; i++)
            data[i] = data[i-1];
        data[index] = element;
        num_items++;
        return true;
    }
}
