package org.fmz.autumn;

public abstract class Vector extends ArrayContainer{

    public Vector(){}// subclass no arguement constructor can default invoke the super no arguement constructor

    public Vector(int initCapacity){
        if(initCapacity < 0)
            data = new Object[DEFAULT_CAPACITY];
        else
            data = new Object[initCapacity];
    }

    public boolean contains(Object o){
        return indexOf(o) != -1;
    }

    public Object elementAt(int index){
        if(index < 0 || index >= num_items)
            return null;
        else
            return data[index];
    }

    public int indexOf(Object o){
        for(int i=0; i<num_items; i++){
            if(o.equals(data[i]))
                return i;
        }
        return -1;
    }

    public boolean remove(Object o){
        if(contains(o)){
            removeAt(indexOf(o));
            return true;
        }
        return false;
    }

    public Object removeAt(int index){
        if(index <0 || index >= num_items)
            return null;
        Object result  = data[index];
        for(; index < num_items; index++)
            data[index] = data[index+1];
        num_items--;
        return result;
    }

    public boolean replace(int index, Object o){
        if(index <0 || index >= num_items)
            return false;
        data[index] = o;
        return true;
    }

    public abstract boolean append(Object o);

    public abstract boolean insertAt(int index, Object o);

}
