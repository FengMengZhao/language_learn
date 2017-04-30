package org.fmz.concurrency;

public class NoVisibility{
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread{
        public void run(){
            while(!ready)
                Thread.yield();
            System.out.println(number);
        }
    }

    public static void main(String args[])throws InterruptedException{
        new ReaderThread().start();
        /*
        Thread t = new ReaderThread();
        t.start();
        t.join();
        */
        ready = true;
        Thread.sleep(1000);
        number = 42;
    }
}
