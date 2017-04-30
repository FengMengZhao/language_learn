package org.fmz.autumn;

public abstract class TreeContainer<T> extends LinkedContainer<T>{

    protected Node<T> root;

    public Node<T> getRoot(){
        return root;
    }

    public void clear(){
        root = null;
        numItems = 0;
    }
}
