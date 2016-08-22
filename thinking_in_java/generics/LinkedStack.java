package org.fmz.generics;

import java.util.*;
import java.util.stream.*;

public class LinkedStack<T>{
    private static class Node<U>{
        U item;
        Node<U> next;
        public Node(){}
        public Node(U item, Node<U> next){
            this.item = item;
            this.next = next;
        }
        public boolean end(){
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<T>();
    public void push(T item){
        top = new Node<T>(item, top);
    }
    public T pop(){
        T result = top.item;
        if(!top.end())
            top = top.next;
        return result;
    }

    public static void main(String args[]){
        LinkedStack<String> ls = new LinkedStack<String>();
        for(String s : "Fmz is a excellent person which is not found by others".split(" "))
            ls.push(s);
        String s;
        while((s = ls.pop()) != null) 
            System.out.println(s);
        LinkedStack<Integer> ls2 = new LinkedStack<Integer>();
        //for(Integer i : Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).toArray(new Integer[10]))
        //for(Integer i : new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})
        for(Integer i : IntStream.of(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}).boxed().toArray(Integer[]::new))
            ls2.push(i);
        Integer i;
        while((i = ls2.pop()) != null)
            System.out.println(i);
    }
}
