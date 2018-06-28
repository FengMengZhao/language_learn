package org.fmz.july;

public class Vector {
    
    private static final int DEFAULT_CAPACITY = 100;
    private Object[] elements;
    private int numItems;

    public Vector(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public Vector(int initCapacity){
        if(initCapacity <= 0){
            elements = new Object[DEFAULT_CAPACITY];
        }else{
            elements = new Object[initCapacity];
        }
    }

    public boolean append(Object element){
        if(isFull()){
            return false;
        }

        elements[numItems] = element;
        numItems++;
        return true;
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

    public boolean insertAt(int index, Object element){
        if(index < 0 || index >= numItems || isFull()){
            return false;
        }
        
        for(int i = numItems; i > index; i--){
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        numItems++;
        return true;
    }

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
