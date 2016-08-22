package org.fmz.autumn;

public class Deque<T> extends Queue<T>{
    
    public T back(){
        if(isEmpty())
            return null;
        return tail.data;
    }

    public void insertFront(T element){
        if(isEmpty())
            head = tail = new DLNode<T>(element);
        else{
            head = head.prev = new DLNode<T>(element, null, head);
            //This is also right
            //head.prev = new DLNode<T>(element, null, head);
            //head = head.prev;
        }
        num_items++;
    }

    public T removeBack(){

        T result = back();

        if(result == null)
            return result;

        tail = tail.prev;
        if(tail != null){
            ((DLNode<T>)tail.next).prev = null;
            tail.next = null;
        }else
            head = null;
        num_items--;
        return result; 
    }
}
