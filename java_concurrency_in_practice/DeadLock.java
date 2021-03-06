package org.fmz.concurrency;

public class DeadLock{
    static class Friend{
        private final String name;
        public Friend(String nm){
            name = nm;
        }

        public String getName(){
            return name;
        }

        public synchronized void bow(Friend bower){
            System.out.format("%s: %s has bowed to me!%n", 
                    name, bower.getName());
            bower.bowBack(this);
        }

        public synchronized void bowBack(Friend bower){
            System.out.format("%s: %s has bowed back to me!%n", 
                    name, bower.getName());
        }
    }

    public static void main(String args[]){
        final Friend alphonse = new Friend("Alphonse");
        final Friend gaston = new Friend("Gaston");

        new Thread(new Runnable(){
            public void run(){ 
                Thread.yield();
                alphonse.bow(gaston); }
        }).start();

        new Thread(new Runnable(){
            public void run(){ 
                Thread.yield();
                gaston.bow(alphonse); }
        }).start();
    }
}
