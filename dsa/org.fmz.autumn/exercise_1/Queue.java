package org.fmz.autumn;

import java.util.Iterator;

public class Queue<T> extends LinearLinkedContainer<T> {

    protected static class DLNode<U> extends SLNode<U>{
        public DLNode<U> previous;
        public DLNode(U dt){
            super(dt);
        }
        public DLNode(U dt, DLNode<U> prev, DLNode<U> nx){
            super(dt, nx);
            previous = prev;
        }
    }

    protected DLNode<T> head; // this field is override
    protected DLNode<T> tail;

    public void insertBack(T element){
        if(isEmpty())
            head = tail = new DLNode<T>(element);
        /*
        else if(head.next == null){
            //System.out.println("I am in...");
            tail = new DLNode<T>(element, head, null);
            head.next = tail;
        }
        else{
            tail = new DLNode<T>(element, tail, null);
            tail.previous.next = tail;
        }
        */
        else{
            tail = new DLNode<T>(element, tail, null);
            tail.previous.next = tail;
        }
        numItems++;
    }

    public T removeFront(){
        if(isEmpty())
            return null;
        if(head.next == null){
            T res = head.data;
            head = tail = null;
            numItems--;
            return res;
        }
        DLNode<T> tmp = head;
        //System.out.println("removeFront() tmp.data: " + tmp.data + "####");
        head = (DLNode<T>)head.next;
        //System.out.println("removeFront() head.data: " + head.data + "####");
        head.previous = null;
        T res = tmp.data;
        tmp = null;
        numItems--;
        return res;
    }

    public T front(){
        //System.out.println("front() head: " + head + "####");
        if(isEmpty())
            return null;
        return head.data;
    }

    @Override
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            private int count = numItems;
            private DLNode<T> node = head;

            public boolean hasNext(){
                return count-- > 0;
            }

            public T next(){
                T res = node.data;
                node = (DLNode<T>)node.next;
                return res;
            }
        };
    }

}
