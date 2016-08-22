package org.fmz.autumn;

public class FixedVector<T> extends Vector<T>{

    public FixedVector(){}

    public FixedVector(int initCapacity){
        super(initCapacity);
    }

    @Override
    public boolean append(T element){
        if(isFull())
            return false;
        data[num_items++] = element;
        return true;
    }

    @Override
    public boolean insertAt(int index, T element){
        if(index < 0 || index >= num_items || isFull())
            return false;
        for(int i=num_items; i>index; i++)
            data[i] = data[i-1];
        data[index] = element;
        num_items++;
        return true;
    }
}
