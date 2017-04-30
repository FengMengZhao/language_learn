package org.fmz.autumn;

public abstract class LinkedContainer<T> extends Container<T>{
    protected static abstract class Node<U>{
        U data;
        public Node(U dt){
            data = dt;
        }
    }
}
