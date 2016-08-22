package org.fmz.hold;

import java.util.*;

public class Shuffle{

    public static <T> void swap(List<T> ls, int i, int j){
        T tmp = ls.get(i);
        ls.set(i, ls.get(j));
        ls.set(j, tmp);
    }

    public static void shuffle(List<?> ls, Random rnd){
        for(int i = ls.size(); i > 1; i--)
            swap(ls, i-1, rnd.nextInt(i));
    }

    public static void main(String args[]){
        /*
        List<String> ls = new ArrayList<>();
        for(String str : args)
            ls.add(str);
        */
        List<String> ls = Arrays.asList(args);
        shuffle(ls, new Random());
        System.out.println(ls);
    }
}
