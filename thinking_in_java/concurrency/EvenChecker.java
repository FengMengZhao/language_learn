package org.fmz.concurrency;

import java.util.concurrent.*;

public class EvenChecker implements Runnable{
    private IntGenerator ig;
    private final int id;

    public EvenChecker(IntGenerator ig, int id){
        this.ig = ig;
        this.id = id;
    }

    public void run(){
        while(!ig.isCancled()){
            int val = ig.next();
            if(val % 2 != 0){
                System.out.println(val + " not even");
                ig.cancle();
            }
        }
    }

    public static void test(IntGenerator ig, int count){
        System.out.println("Press Control-C to exit");
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < count; i++)
            exec.execute(new EvenChecker(ig, i));
        exec.shutdown();
    }
}
