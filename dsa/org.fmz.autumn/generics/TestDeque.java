package org.fmz.autumn;

public class TestDeque{
    public static void main(String args[]){
        Deque<Integer> deque = new Deque<Integer>();
        deque.insertFront(1);
        deque.insertFront(2);
        deque.insertFront(3);

        deque.insertBack(4);
        deque.insertBack(5);
        deque.insertBack(6);

        System.out.println(deque.removeBack());

        for(Integer I : deque)
            System.out.print(I + "\t");
    }
}
