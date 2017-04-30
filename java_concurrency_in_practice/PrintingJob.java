package org.fmz.concurrency;

public class PrintingJob implements Runnable{
    private PrinterQueue printerQueue;

    public PrintingJob(PrinterQueue printerQ){
        printerQueue = printerQ;
    }

    @Override
    public void run(){
        System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
        printerQueue.printJob(new Object());
    }
}
