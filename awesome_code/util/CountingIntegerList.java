package org.fmz.util;

import java.util.AbstractList;

public class CountingIntegerList extends AbstractList{
    private int size;
    public CountingIntegerList(int sz){ 
        size = sz < 0 ? 0 : sz;       
    }

    @Override
    public Integer get(int index){ return index++; }

    @Override
    public int size(){ return size; }

    public static void main(String args[]){
        System.out.println(new CountingIntegerList(10000));
    }
}
