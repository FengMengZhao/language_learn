package org.fmz.generics;

import java.util.*;

public class Generators{
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int sz){
        for(int i = 0; i < sz; i++)
            coll.add(gen.next());
        return coll;
    }

    public static void main(String args[]){
        System.out.println(fill(new ArrayList(), new CoffeeGenerator(), 100));
    }
}
