package org.fmz.autumn;

public class QueueTest{
    public static void main(String args[]){
        Queue<String> queue = new Queue<>();

        queue.insertBack("fmz");
        queue.insertBack("cll");
        queue.insertBack("wlm");
        queue.insertBack("zjb");
        queue.insertBack("fsl");
        queue.insertBack("fls");
        queue.insertBack("rbr");

        /*
        System.out.println(queue.front());
        queue.removeFront();
        System.out.println(queue.front());
        queue.removeFront();
        System.out.println(queue.front());
        queue.removeFront();
        System.out.println(queue.front());
        queue.removeFront();
        System.out.println(queue.front());
        queue.removeFront();
        System.out.println(queue.front());
        queue.removeFront();
        System.out.println(queue.front());
        queue.removeFront();
        System.out.println(queue.front());
        */

        for(String str : queue)
            System.out.print(str + ", ");
        System.out.println("\n######################");
    }
}
