package org.fmz.concurrency;

public class NotifyAndWait_E0{
    public static void main(String args[]){
        ThreadB b = new ThreadB();
        b.start();
        System.out.println("Total is " + b.total);
    }
}

class ThreadA extends Thread{
    int total;
    public void run(){
        for(int i = 0; i < 100; i++){
            total += i;
        }
   }
}
