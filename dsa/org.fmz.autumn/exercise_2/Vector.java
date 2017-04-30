package org.fmz.autumn;

import java.util.Iterator;

public abstract class Vector<T> extends ArrayContainer<T> {
    public Vector(){}

    public Vector(int initCapacity){
        super(initCapacity);
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

    public int indexOf(Object o){
        if(null == o){
            for(int i = 0; i < numItems; i++)
                if(null == data[i]) return i;
        }

        for(int i = 0; i < numItems; i++)
            if(o.equals(data[i])) return i;

        return -1;
    }

    public boolean remove(Object o){
        return removeAt(indexOf(o)) != null;
    }

    @SuppressWarnings("unchecked")
    public T removeAt(int index){
        if(index < 0 || index >= numItems)
            return null;

        T res = (T)data[index];
        for(int i = index; i < numItems - 1; i++)
            data[i] = data[i + 1];
        numItems--;
        return res;
    }

    public boolean replace(int index, Object o){
        if(index < 0 || index >= numItems)
            return false;

        data[index] = o;
        return true;
    }

    @SuppressWarnings("unchecked")
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            public boolean hasNext(){
                return isEmpty();
            }

            int i = 0;
            public T next(){
                return (T)data[i++];
            }

            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }

    public abstract boolean append(T element);

    public abstract boolean insertAt(int index, T element);
}
