package org.fmz.concurrency;

public class HelloWorld{
    public static void main(String args[]) throws Exception{
        Thread myThread = new Thread(){
            public void run(){
                System.out.println("Hello from new thread");
            }
        };

        myThread.start();
        //Thread.yield();
        //Thread.sleep(1);
        System.out.println("Hello from main thrad");
        myThread.join();
        //System.out.println("Last execution");
    }
}
