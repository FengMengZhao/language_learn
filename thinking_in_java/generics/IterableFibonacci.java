package org.fmz.generics;

import java.util.*;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer>{
    private int count;
    public IterableFibonacci(int n){count = n;}
    public Iterator<Integer> iterator(){
        return new Iterator<Integer>(){
            public boolean hasNext(){return count > 0;}
            public Integer next(){
               count--;
               return IterableFibonacci.this.next();
            }
            public void remove(){throw new UnsupportedOperationException();}
        };
    }

    public static void main(String args[]){
        for(int i : new IterableFibonacci(15))
            System.out.print(i + " ");
    }
}
