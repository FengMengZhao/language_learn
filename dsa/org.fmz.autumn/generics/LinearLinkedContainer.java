package org.fmz.autumn;

public abstract class LinearLinkedContainer<T> extends LinkedContainer<T>{

    protected static class SLNode<U> extends Node<U>{

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
    }
}
