package org.fmz.concurrency;

import java.util.concurrent.*;

public class SingleThreadExecutor{
    public static void main(String args[]){
        ExecutorService exec = Executors.newSingleThreadExecutor();

        for(int i = 0; i < 5; i++)
            exec.execute(new LifeOff(5));
        exec.shutdown();
        System.out.println("Waiting for the lifeoff");
    }
}
