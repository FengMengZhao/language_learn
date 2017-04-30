package org.fmz.concurrency;


public class MoreBasicThreadsJoin{
    public static void main(String args[]){
        for(int i = 0; i < 5; i++){
            Thread t  = new Thread(new LifeOff(5));
            t.start();
            try{
                t.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            //new Thread(new LifeOff(5)).start();
        }
        System.out.println("Waiting for LifeOff!");
    }
}
