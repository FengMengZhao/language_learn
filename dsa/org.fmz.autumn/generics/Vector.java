package org.fmz.autumn;

public abstract class Vector<T> extends ArrayContainer<T>{

    public Vector(){}

    public Vector(int initCapacity){
        super(initCapacity);
    }

    public boolean containes(T element){
        return indexOf(element) != -1;
    }

    @SuppressWarnings("unchecked")
    public T elementAt(int index){
        if(index < 0 || index >= num_items)
            return null;
        return (T)data[index];
    }

    public int indexOf(T element){
        int i = 0;
        while(i < num_items){
            if(element.equals(data[i]))
                return i;
            i++;
        }
        return -1;

    }

    @SuppressWarnings("unchecked")
    public T removeAt(int index){
        if(index < 0 || index >= num_items)
            return null;
        T result = (T)data[index];
        for(int i = index; i < num_items-1; i++)
            data[i] = data[i+1];
        data[num_items-1] = null;
        num_items--;
        return result;
    }

    public boolean remove(T element){
        if(!containes(element))
            return false;
        removeAt(indexOf(element));
        num_items--;
        return true;
    }

    public boolean replace(int index, T element){
        if(index < 0 || index >= num_items)
            return false;
        data[index] = element;
        return true;
    }

    public abstract boolean append(T element);

    public abstract boolean insertAt(int index, T element);

}
