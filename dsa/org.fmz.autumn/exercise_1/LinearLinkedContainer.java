package org.fmz.autumn;

import java.util.Iterator;

public abstract class LinearLinkedContainer<T> extends LinkedContainer<T>{
    protected static class SLNode<U> extends Node<U> {
        public SLNode<U> next;

        public SLNode(U dt){
            super(dt);
        }
        public SLNode(U dt, SLNode<U> nx){
            super(dt);
            next = nx;
        }
    }

    protected SLNode<T> head;

    public void clear(){
        head = null;
        numItems = 0;
    }

    @Override
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            private int count = numItems;
            private SLNode<T> node = head;

            public boolean hasNext(){
                return count-- > 0;
            }

            T res;
            public T next(){
                System.out.println("#####" + node + "####");
                res = node.data;
                node = node.next;
                return res;
            }
        };
    }
}
