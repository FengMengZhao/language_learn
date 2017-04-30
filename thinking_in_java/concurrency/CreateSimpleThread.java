package org.fmz.concurrency;

public class CreateSimpleThread{

    private static void log(String message){
        System.out.printf("%tT [%s] %s%n", System.currentTimeMillis(), Thread.currentThread().getName(), message);
    }

    public static void main(String args[]) throws InterruptedException{
        CreateSimpleThread.log("start");

        /*
        Thread t = new Thread("My Thread"){
            public void run(){
                CreateSimpleThread.log("Hello from thread");
            }
        };
        t.start();
        */

        ///*
        Runnable r = new Runnable(){
            public void run(){
                CreateSimpleThread.log("Hello from thread");
            }
        };
        Thread t = new Thread(r, "My Thread");
        t.start();
        //*/

        CreateSimpleThread.log("Waiting for thread to finish");
        t.join();

        CreateSimpleThread.log("Done");
    }
}
