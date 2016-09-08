package org.fmz.autumn;

public class Deque<T> extends Queue<T> {

    public void insertFront(T element){
        if(isEmpty())
            head = tail = new DLNode<T>(element);
        else if(tail.previous == null){
            head = new DLNode<T>(element, null, head);
            tail.previous = head;
        }else{

        }
    }
}
