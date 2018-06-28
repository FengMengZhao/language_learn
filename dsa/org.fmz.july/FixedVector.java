package org.fmz.july;

public class FixedVector extends AbstractVector{

    public FixedVector(int initCapacity){
        super(initCapacity);
    }

    @Override
    public boolean append(Object element){
        if(isFull()){
            return false;
        }

        elements[numItems] = element;
        numItems++;
        return true;

    }  

    @Override
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

}
