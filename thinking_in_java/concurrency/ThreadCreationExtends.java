package org.fmz.concurrency;

public class ThreadCreationExtends extends Thread{
    private int tickets = 100;
    ThreadCreationExtends(String name){
        super(name);
    }

    public void run(){
        while(tickets > 0)
            System.out.println(tickets-- + " is saled by " + Thread.currentThread().getName());
    }

    public static void main(String args[]){
        ThreadCreationExtends t1 = new ThreadCreationExtends("Window1");
        ThreadCreationExtends t2 = new ThreadCreationExtends("Window2");
        ThreadCreationExtends t3 = new ThreadCreationExtends("Window3");
        t1.start();
        t2.start();
        t3.start();
        /*
        new ThreadCreationExtends("Window1").start();
        new ThreadCreationExtends("Window2").start();
        new ThreadCreationExtends("Window3").start();
        */
    }
}
