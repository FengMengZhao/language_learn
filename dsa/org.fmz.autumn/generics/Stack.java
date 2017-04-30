package org.fmz.autumn;

import java.util.Iterator;

public class Stack<T> extends LinearLinkedContainer<T>{

    //protected SLNode<T> head = new SLNode<T>(null, null);

    public void push(T element){
        if(isEmpty())
            head = new SLNode<T>(element);
        else
            head = new SLNode<T>(element, head);
       num_items++;

        //head = new SLNode<T>(element, head);
        
    }

    /*
    private boolean end(){
        return head.data == null && head.next == null;
    }
    */

    public T pop(){
        T result = head.data;
        if(! isEmpty())
            head = head.next;        
        num_items--;
        return result;
    }

    public T peek(){
        if(isEmpty())
            return null;
        return head.data;
    }

    public Iterator<T> iterator(){
        return new Iterator<T>(){

            //is right
            //private int count = num_items;
            public boolean hasNext(){
                return ! Stack.this.isEmpty();
            }

            public T next(){
                //count--;
                return Stack.this.pop();
            }

            public void remove(){ throw new UnsupportedOperationException(); }
        };
    }
}
