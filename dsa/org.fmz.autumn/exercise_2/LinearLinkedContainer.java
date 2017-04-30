package org.fmz.autumn;

import java.util.Iterator;

public abstract class LinearLinkedContainer<T> extends LinkedContainer<T>{
    protected static class SLNode<U> extends Node<U>{
        public SLNode<U> next;
        public SLNode(U dt){
            super(dt);
        }
        public SLNode(U dt, SLNode<U> nxt){
            super(dt);
            next = nxt;
        }
    }

    protected SLNode<T> head;

    public void clear(){
        head = null;
        numItems = 0;
    }

    @SuppressWarnings("unchecked")
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            public boolean hasNext(){
                return numItems >= 0;
            }

            SLNode<T> current = head;
            public T next(){
                T res = current.data;
                current = current.next;
                return res;
            }

            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
    }
}
