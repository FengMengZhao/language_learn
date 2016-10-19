package org.fmz.concurrency;

public class MsgWaitNotifyTest{
    public static void main(String args[]){
        Message msg = new Message("process it");
        MsgWaiter waiter = new MsgWaiter(msg);
        new Thread(waiter, "waiter").start();
        
        MsgWaiter waiter1 = new MsgWaiter(msg);
        new Thread(waiter1, "waiter1").start();

        MsgNotifier notifier = new MsgNotifier(msg);
        new Thread(notifier, "notifier").start();
        MsgNotifier notifier2 = new MsgNotifier(msg);
        new Thread(notifier2, "notifier2").start();
        System.out.println("All the threads are started");
    }
}
