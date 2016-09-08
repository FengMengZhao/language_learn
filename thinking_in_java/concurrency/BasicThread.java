package org.fmz.concurrency;

public class BasicThread{
    public static void main(String args[]){
        Thread t = new Thread(new LifeOff(20));
        t.start();
        System.out.println("Waiting for LifeOff!");
    }
}
