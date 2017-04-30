package org.fmz.autumn;

public abstract class Vector<T> extends ArrayContainer<T>{

    public Vector(){}

    public Vector(int initCapacity){
        if(initCapacity < 0)
            data = new Object[DEFAULT_CAPACITY];
        else
            data = new Object[initCapacity];
    }

    public int indexOf(Object o){
        if(o == null){
            for(int i = 0; i < numItems; i++)
                if(data[i] == null)
                    return i;
        }else{
            for(int i = 0; i < numItems; i++)
                if(data[i].equals(o))
                    return i;
        }
        return -1;
    }

    public boolean contains(Object o){
        return indexOf(o) != -1;
    }

    @SuppressWarnings("unchecked")
    public T elementAt(int index){
        if(index < 0 || index >= numItems)
            return null;
        return (T)data[index];
    }

    @SuppressWarnings("unchecked")
    public T removeAt(int index){
        Object res = elementAt(index);
        if(res != null){
            for(; index < numItems - 1; index++)
                data[index] = data[index + 1];
            data[numItems - 1] = null;
        }
        return (T)res;
    }

    public boolean remove(Object o){
        return removeAt(indexOf(o)) != null;
    }

    public boolean append(T element){
        return insertAt(size(), element);
    }

    protected void safeInsertAt(int index, T element){
        for(int pos = numItems; pos > index; pos--)
                data[pos] = data[pos - 1];
        data[index] = element;
        numItems++;
    }

    public abstract boolean insertAt(int index, T element);
}
