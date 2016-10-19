package org.fmz.autumn;

public class Stack<T> extends LinearLinkedContainer<T>{
    public void push(T element){
        if(isEmpty())
            head = new SLNode<T>(element);
        else{
            head = new SLNode<T>(element, head);
        }
        numItems++;
    }

    public T pop(){
        if(isEmpty())
            return null;
        T res = head.data;
        head = head.next;
        numItems--;
        return res;
    }

    public T peek(){
        if(isEmpty())
            return null;
        return head.data;
    }
}
