package org.fmz.autumn;

import java.util.Iterator;
 
public class Queue<T> extends LinearLinkedContainer<T>{

    protected static class DLNode<U> extends SLNode<U>{
        public DLNode<U> prev;

        public DLNode(U dt){
            super(dt);
        }


        public DLNode(U dt, DLNode<U> pre, DLNode<U> nx){
            super(dt, nx);
            prev = pre;
        }
    }

    protected DLNode<T> head;
    protected DLNode<T> tail;

    public T front(){
        if(isEmpty())
            return null;
        return head.data;
    }

    public void clear(){
        super.clear();
        tail = null;
    }

    public void insertBack(T element){
        if(isEmpty())
            head = tail = new DLNode<T>(element);
        else{
            tail.next = new DLNode<T>(element, tail, null);
            tail = (DLNode<T>)tail.next;
            // tail = new DLNode<T>(element, tail, null);
        }
        num_items++;
    }
    
    public T removeFront(){
        T tmp = front();
        if(tmp == null)
            return null;
        head = (DLNode<T>)head.next;
        if(head != null){
            head.prev.next = null;
            head.prev = null;
        }else
            tail = null;
        num_items--;
        return tmp;
    }

    public Iterator<T> iterator(){
        return new Iterator<T>(){
            public boolean hasNext(){
                return ! Queue.this.isEmpty();
            }

            public T next(){
                return removeFront();
            }

            public void remove(){ throw new UnsupportedOperationException(); }
        };
    }
}
