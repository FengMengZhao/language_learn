package org.fmz.july;

public abstract class AbstractVector{
    
    private static final int DEFAULT_CAPACITY = 100;
    protected Object[] elements;
    protected int numItems;

    public abstract boolean append(Object element);

    public AbstractVector(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public AbstractVector(int initCapacity){
        if(initCapacity <= 0){
            elements = new Object[DEFAULT_CAPACITY];
        }else{
            elements = new Object[initCapacity];
        }
    }

    public void clear(){
        for(int i = 0; i < numItems; i++){
            elements[i] = null;
        }
        numItems = 0;
    }

    public boolean contains(Object element){
        return indexOf(element) != -1;
    }

    public Object elementAt(int index){
        if(index < 0 || index >= numItems){
            return null;
        }
        return elements[index];
    }

    public int indexOf(Object element){
        for(int i = 0; i < numItems; i++){
            if(elements[i] == element){
                return i;
            }
        }
        return -1;
    }

    public abstract boolean insertAt(int index, Object element);
        
    public boolean isEmpty(){
        return numItems == 0;
    }

    public boolean isFull(){
        return numItems == elements.length;
    }

    public Object removeAt(int index){
        if(index < 0 || index >= numItems){
            return null;
        }

        Object result = elements[index];
        for(int i = index; i < numItems - 1; i--){
            elements[i] = elements[i+1];
        }
        elements[numItems - 1] = null;
        numItems--;
        return result;
    }

    public boolean remove(Object element){
        int index = indexOf(element);
        if(index == -1){
            return false;
        }
        removeAt(index);
        return true;
    }

    public int size(){
       return numItems; 
    }

}
