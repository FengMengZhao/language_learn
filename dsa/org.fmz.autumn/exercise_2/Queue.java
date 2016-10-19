package org.fmz.autumn;

public class Queue<T> extends LinearLinkedContainer<T>{
    protected static class DLNode<U> extends SLNode<U>{
        public DLNode<U> previous;
        public DLNode<U> next;// Override

        public DLNode(U dt){
            super(dt);
        }

        public DLNode(U dt, DLNode<U> prev, DLNode<U> nx){
            super(dt);
            previous = prev;
            nx = next;
        }
    }

    protected DLNode<T> head,
                        tail;

    public void insertBack(T element){
        if(isEmpty())
            head = tail = new DLNode<T>(element);
        else{
            tail = new DLNode<T>(element, tail, null);
            tail.previous.next = tail;
        }
        numItems++;
    }

    public T removeFront(){
        if(isEmpty())
            return null;
        if(null == head.next){
            T res = head.data;
            head = tail = null;
            numItems--;
            return res;
        }
        head = head.next;
        head.previous.next = null;
        head.previous = null;
        numItems--;
        return head.data;
    }

    public T front(){
        if(isEmpty())
            return null;
        return head.data;
    }
}
