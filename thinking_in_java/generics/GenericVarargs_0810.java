package org.fmz.generics;

import java.util.*;

public class GenericVarargs_0810{

    static <T> List<T> makeList(T... arg){
        List<T> ls = new ArrayList<T>();
        for(T t : arg)
            ls.add(t);
        return ls;
    }

    public static void main(String args[]){
        Integer[] it_arr = {1, 2, 3, 4, 5};
        System.out.println(makeList(it_arr));
        System.out.println(Arrays.asList(it_arr));
        System.out.println(makeList(6, 7, 8, 9, 10));
    }
}
