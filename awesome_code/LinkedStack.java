package org.fmz.awesome;

import java.util.*;

public class LinkedStack<T> implements Iterable<T>{
    private static class Node<U>{
        U item;
        Node<U> next;
        public Node(){
            item = null;
            next = null;
        }
        public Node(U it, Node<U> nx){
            item = it;
            next = nx;
        }
        boolean end(){return item == null && next == null;}
    }

    private Node<T> top = new Node<T>();
    private int size = 0;

    public void push(T item){
        top = new Node<T>(item, top);
        size++; 
    }

    public T pop(){
        T result = top.item;
        if(! top.end()) top = top.next;
        size--;
        return result;
    }

    public T peek(){return top.item;}

    public int size(){return size;}

    public Iterator<T> iterator(){
        return new Iterator<T>(){
            public boolean hasNext(){return ! top.end();}
            public T next(){return pop();}
            public void remove(){throw new UnsupportedOperationException();}
        };
    }

    public static void main(String args[]){
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        
        for(Integer I : stack){System.out.print(I + "\t");}
    }
}
