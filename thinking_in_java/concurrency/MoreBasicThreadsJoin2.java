package org.fmz.concurrency;

import java.util.*;

public class MoreBasicThreadsJoin2{
    public static void main(String args[]){
        List<Thread> ls = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            Thread t  = new Thread(new LifeOff(5));
            t.start();
            ls.add(t);
            /*
            try{
                t.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            */
            //new Thread(new LifeOff(5)).start();
        }
        for(Thread t : ls){
            try{
                t.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Waiting for LifeOff!");
    }
}
