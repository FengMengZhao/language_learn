package org.fmz.concurrency;

public class ThreadCreationShareResource implements Runnable{
    private int tickets = 300;

    public void run(){
        synchronized(this){
            while(tickets > 0)
                System.out.println(tickets-- + " is saled by " + Thread.currentThread().getName());
        }
        /*
        while(tickets > 0)
            System.out.println(tickets-- + " is saled by " + Thread.currentThread().getName());
        */
    }

    public static void main(String args[]){
        ThreadCreationShareResource r = new ThreadCreationShareResource();
        Thread t1 = new Thread(r, "Window1");
        Thread t2 = new Thread(r, "Window2");
        Thread t3 = new Thread(r, "Window3");
        t1.start();
        t2.start();
        t3.start();
    }
}
