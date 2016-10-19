package org.fmz.concurrency;

public class MsgWaiter implements Runnable{
    private Message msg;

    public MsgWaiter(Message m){
        msg = m;
    }

    public void run(){
        String name = Thread.currentThread().getName();
        synchronized(msg){
            try{
                System.out.println(name + " waiting to get notified at time:" + System.currentTimeMillis());
                msg.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(name + " waiting to get notified at time:" + System.currentTimeMillis());
            System.out.println(name + " processed: " + msg.getMsg());
        }
    }
}
