package org.fmz.generics;

public class Erased<T>{

    private final int SIZE = 100;

    /*
    public static void f(Object arg){
        if(T instanceof arg){}
    }

    T var = new T();
    */

    @SuppressWarnings("unchecked")
    T[] array = (T)new Object[SIZE];


    public static void main(String arg[]){
        Erased<Integer> ei = new Erased<Integer>();
        for(Integer I : ei.array)
            System.out.print(I + "\t");
    }
}
