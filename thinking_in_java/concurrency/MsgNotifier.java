package org.fmz.concurrency;

public class MsgNotifier implements Runnable{
    private Message msg;

    public MsgNotifier(Message m){
        msg = m;
    }

    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println(name + " started");
        try{
            Thread.sleep(1000);
            synchronized(msg){
                msg.setMsg(name + " Notifier work done");
                msg.notify();
                //msg.notifyAll();
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
