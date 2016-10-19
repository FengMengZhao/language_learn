package org.fmz.autumn;

public abstract class TreeContainer<T> extends LinkedContainer<T>{
    protected Node<T> root;

    public void clear(){
        root = null;
        numItems = 0;
    }
}
