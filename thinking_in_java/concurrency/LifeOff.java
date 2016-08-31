package org.fmz.concurrency;

public class LifeOff implements Runnable{
    private int count_down = 10;
    private static int count = 0;
    private final int id = count++;

    public LifeOff(){}

    public LifeOff(int count_down){
        this.count_down = count_down;
    }

    public String status(){
        return id + "#" + "(" +
            (count_down > 0 ? count_down : "lifeoff!") + ")";
    }

    public void run(){
        while(count_down-- > 0){
            System.out.println(status());
            Thread.yield();
        }
    }

    public static void main(String args[]){
        LifeOff lo = new LifeOff();
        lo.run();
    }
}
