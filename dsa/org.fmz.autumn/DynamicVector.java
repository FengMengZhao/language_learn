package org.fmz.autumn;

public class DynamicVector extends Vector{
    
    public DynamicVector(){}

    public DynamicVector(int initCapacity){
        super(initCapacity);// must specific the body, otherwise will invoke the super no arguement constructor
    }
    
    protected void ensureCapacity(int new_capacity){
        if(new_capacity < data.length)
            return;
        Object[] new_data = new Object[new_capacity];
        for(int i=0; i < num_items; i++)
            new_data[i] = data[i];
        data = new_data;
    }

    public boolean append(Object o){
        if(isFull())
            ensureCapacity(data.length * 2);
        data[num_items] = o;
        num_items++;
        return true;
    }

    public boolean insertAt(int index, Object o){
        if(index < 0 || index >= num_items)
            return false;
        if(isFull())
            ensureCapacity(data.length * 2);
        for(int i = num_items; i>index; i--)
            data[i] = data[i-1];
        data[index] = o;
        num_items++;
        return true;
    }
}
