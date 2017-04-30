package org.fmz.concurrency;

import java.util.*;

public class MoreBasicThreads{
    public static void main(String args[]){
        List<Thread> ls = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            Thread t  = new Thread(new LifeOff(5));
            t.start();
        }
        System.out.println("Waiting for LifeOff!");
    }
}
