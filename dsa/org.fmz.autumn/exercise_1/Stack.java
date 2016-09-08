package org.fmz.autumn;

public class Stack<T> extends LinearLinkedContainer<T>{

    public void push(T element){
        if(isEmpty())
            head = new SLNode<T>(element);
        else
            head = new SLNode<T>(element, head);
        numItems++;
    }

    public T pop(){
        /* urgly code
        if(head == null)
            return null;
        SLNode<T> tmp_head = head;
        T res = head.data;
        head = head.next;
        tmp_head = null;
        numItems--;
        return res;
        */
        // elegant code
        T res = head.data;
        if(! isEmpty()){
            SLNode<T> tmp = head; // avoid wild pointer
            head = head.next;
            tmp = null;
        }
        numItems --;
        return res;
    }

    public T peek(){
        if(isEmpty())
            return null;
        return head.data;
    }
}
