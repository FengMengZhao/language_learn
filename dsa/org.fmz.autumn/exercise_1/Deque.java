package org.fmz.autumn;

public class Deque<T> extends Queue<T> {

    public void insertFront(T element){
        if(isEmpty())
            head = tail = new DLNode<T>(element);
        else{
            head = new DLNode<T>(element, null, head);
            ((DLNode<T>)head.next).previous = head;
        }
        numItems++;
    }

    public T removeBack(){
        if(isEmpty())
            return null;
        if(tail.previous == null){
            T res = tail.data;
            head = tail = null;
            numItems--;
            return res;
        }

        DLNode<T> tmp = tail;
        tail = tail.previous;
        tail.next = null;
        T res = tmp.data;
        tmp = null;
        numItems--;
        return res;
    }

    public T back(){
        if(isEmpty())
            return null;
        return tail.data;
    }
}
