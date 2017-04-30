package org.fmz.concurrency;

public class ThreadCreationRunnable implements Runnable{
    private int tickets = 100;
    private String name;

    public ThreadCreationRunnable(String name){
        this.name = name;
    }
    
    public void run(){
        while(tickets > 0)
            System.out.println(tickets-- + " is saled by " + Thread.currentThread().getName());
    }

    public static void main(String args[]){
        new Thread(new ThreadCreationRunnable("Window1")).start();
        new Thread(new ThreadCreationRunnable("Window2")).start();
        new Thread(new ThreadCreationRunnable("Window3")).start();
    }
}
