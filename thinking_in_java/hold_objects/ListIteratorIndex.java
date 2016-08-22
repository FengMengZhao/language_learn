package org.fmz.hold;

import java.util.*;

public class ListIteratorIndex{

    public static <T> void replace(List<T> list, T element, T new_element){
        for(ListIterator<T> it = list.listIterator(); it.hasNext();)
            if(element == null ? it.next() == null : element.equals(it.next()))
                it.set(new_element);

    }

    public static <T> void replace(List<T> list, T element, List<? extends T> new_element){
        for(ListIterator<T> it = list.listIterator(); it.hasNext();){
            if(element == null ? it.next() == null : element.equals(it.next())){
                it.remove();
                for(T t : new_element)
                    it.add(t);
            }
        }
    } 
    public static void main(String arg[]){
        List<String> ls = new ArrayList<>(Arrays.asList("My name is fmz what is your name".split(" ")));
        System.out.println(ls);


        /*
        for(ListIterator<String> it = ls.listIterator(4); it.hasPrevious();)
            if(it.previous().equals("is"))
                it.remove();
        System.out.println(ls);
        */

        replace(ls, "is", "be");
        System.out.println(ls);

        replace(ls, "name", Arrays.asList("put", "your", "real", "name"));
        System.out.println(ls);
    }
}
