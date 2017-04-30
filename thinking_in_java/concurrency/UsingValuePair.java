package org.fmz.concurrency;

public class UsingValuePair{
    public static void main(String args[]) throws InterruptedException{
        ValuePair object1 = new ValuePair();
        object1.setValue(1);
        ValuePair object2 = new ValuePair();
        object2.setValue(5);

        Thread t1 = new Thread("Thread 1"){
            public void run(){
                object1.copy(object2);
            }
        };

        Thread t2 = new Thread("Thread 2"){
            public void run(){
                //object2.setValue(12);
                object2.copy(object1);
            }
        };

        t1.start();
        t2.start();
        
        t1.join();
        t2.join();

        System.out.println(object1);
    }
}

