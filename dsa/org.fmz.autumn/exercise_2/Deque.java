package org.fmz.autumn;

public class Deque<T> extends Queue<T>{
    public void insertFront(T element){
        if(isEmpty())
            head = tail = new DLNode<T>(element);
        else{
            head = new DLNode<T>(element, null, head);
        }
        numItems++;
    }

    public T removeBack(){
        if(isEmpty())
            return null;
        if(null == tail.previous){
            T res = tail.data;
            tail = head = null;
            numItems--;
            return res;
        }

        tail.previous = tail;
        tail.next.previous = null;
        tail.next = null;
        numItems--;
        return tail.data;
    }

    public T back(){
        if(isEmpty())
            return null;
        return tail.data;
    }
}
