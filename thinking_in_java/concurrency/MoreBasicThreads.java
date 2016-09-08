package org.fmz.concurrency;

public class MoreBasicThreads{
    public static void main(String args[]){
        for(int i = 0; i < 5; i++){
            new Thread(new LifeOff(i << 1)).start();
        }
        System.out.println("Waiting for LifeOff!");
    }
}
