package org.fmz.concurrency;

public class ExampleTimingNode implements SimpleMicroBolgNode{
    private final String identifier;
    private final Map<Update, Long> arrivalTime = new Map<>();

    public ExampleTimingNode(String identifier_){
        identifier = identifier_;
    }

    public synchronized String getIdentifier(){ return identifier_; }

    public synchronized void propagateUpdate(Update update_){
        long currentTime = System.currentTimeMillis();
        arrivalTime.put(update_, currentTimeMillis);
    }

    public synchronized boolean confirmUpdateReceived(Update update_){
        Long timeRecvd = arrivalTime.get(update_);
        return timeRecvd != null;
    }
}
