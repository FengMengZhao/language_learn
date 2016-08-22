package org.fmz.autumn;

public class FixedVector extends Vector{

    public FixedVector(){}// default invoke

    public FixedVector(int initCapacity){
        super(initCapacity);// must specific the body, otherwise will invoke super no arguement constructor
    }

    public boolean append(Object o){
        if(isFull())
            return false;
        data[num_items] = o;
        num_items++;
        return true;
    }

    public boolean insertAt(int index, Object o){
        if(index < 0 || index > num_items-1 || isFull())
            return false;
        for(int i=num_items; i > index; i--)
            data[i] = data[i-1];
        data[index] = o;
        num_items++;
        return true;
    }
}
