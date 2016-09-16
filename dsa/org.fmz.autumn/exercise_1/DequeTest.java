package org.fmz.autumn;

public class DequeTest{
    public static void main(String args[]){
        Deque<String> deque = new Deque<>();

        // rbr fls wlm fmz cll zjb fsl
        deque.insertBack("fmz");
        deque.insertBack("cll");
        deque.insertFront("wlm");
        deque.insertBack("zjb");
        deque.insertBack("fsl");
        deque.insertFront("fls");
        deque.insertFront("rbr");

        System.out.println(deque.front());// rbr
        deque.removeFront();
        System.out.println(deque.front());// fls
        deque.removeBack();
        System.out.println(deque.back());// zjb
        deque.removeBack();
        System.out.println(deque.back());// cll 
        deque.removeFront(); 
        System.out.println(deque.front());// wlm
        deque.removeFront();
        System.out.println(deque.front());// fmz
        deque.removeBack();
        System.out.println(deque.back());// fmz

        /*
        for(String str : deque)
            System.out.print(str + ", ");
        System.out.println("\n######################");
        */
    }
}
