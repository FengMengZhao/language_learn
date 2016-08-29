package org.fmz.generics;

import java.lang.reflect.*;

public class GenericArrayWithTypeToken<T>{
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArrayWithTypeToken(Class<T> type, int sz){
        array = (T[])Array.newInstance(type, sz);
    }

    public void put(int index, T item){
        array[index] = item;
    }

    public T get(int index){
        return array[index];
    }

    public T[] rep(){ return array; }

    public static void main(String args[]){
        GenericArrayWithTypeToken<Integer> gawtt = new GenericArrayWithTypeToken<Integer>(Integer.class, 100);

        Integer[] array = gawtt.rep();
        System.out.println(array.length);
        for(Integer I : array)
            System.out.print(I + "\t");
    }
}