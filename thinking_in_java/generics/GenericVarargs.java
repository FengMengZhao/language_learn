package org.fmz.generics;

import java.util.*;

public class GenericVarargs{
    public static <T> List<T> makeList(T... args){
        List<T> array_list = new ArrayList<T>();
        for(T item : args)
            array_list.add(item);
        return array_list;
    }

    public static void main(String args[]){
        List<String> ls = makeList("A");
        System.out.println(ls);
        ls = makeList("A", "B", "C");
        System.out.println(ls);
        ls = makeList("ABCDEFGHIJKLMNOPQ".split(""));
        System.out.println(ls);
        List<String> ls2 = Arrays.asList("aaa", "bbb", "ccc");
        System.out.println(ls2);
    }
}
