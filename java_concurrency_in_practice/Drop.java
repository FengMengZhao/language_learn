package org.fmz.concurrency;

public class Drop{
    // Message sent from producer to consumer
    private String message;
    // True if consumer should wait
    // for producer to send message
    // false if producer should wait for 
    // consumer to retrieve message
    private boolean empty = true;

    public synchronized String take(){
        // Waint until message is available
        while(empty){
            try{
                wait();
            }catch(InterruptedException e){}
        }

        empty = true;
        // Notify producer that 
        // status has changed
        notifyAll();
        return message;
    }

    public synchronized void put(String message){
        // Wait until message has been retrieved
        while(!empty){
            try{
                wait();
            }catch(InterruptedException e){}
        }

        empty = false;
        // Notify customer that 
        // status has changed
        this.message = message;
        notifyAll();
    }
}
