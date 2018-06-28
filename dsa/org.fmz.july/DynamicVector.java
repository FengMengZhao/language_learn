package org.fmz.july;

public class DynamicVector extends AbstractVector{

    public DynamicVector(int initCapacity){
        super(initCapacity);
    }

    @Override
    public boolean append(Object element){
        if(isFull()){
            ensureCapacity((int)(numItems * 1.5));
        }
        elements[numItems] = element;
        numItems++;
        return true;

    }  

    @Override
    public boolean insertAt(int index, Object element){
        if(index < 0 || index >= numItems){
            return false;
        }

        if(isFull()){
            ensureCapacity((int)(numItems * 1.5));
        }
        for(int i = numItems; i > index; i--){
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        numItems++;
        return true;
    }

    private void ensureCapacity(int capacitySize){
        if(capacitySize <= elements.length){
            return;
        }        
        Object[] newElements = new Object[capacitySize];
        System.arraycopy(elements, 0, newElements, 0, numItems);
        elements = newElements;
        newElements = null;
    }
}
