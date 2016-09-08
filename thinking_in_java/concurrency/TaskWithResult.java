package org.fmz.concurrency;

import java.util.*;
import java.util.concurrent.*;

public class TaskWithResult implements Callable<String>{
    private int id;     

    public TaskWithResult(int id){
        this.id = id;
    }
    public String call(){
        return "Result of TaskWithResult " + id;
    }

    public static void main(String args[]){
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> result = 
            new ArrayList<>();
        for(int i = 0; i < 100; i++)
            result.add(exec.submit(new TaskWithResult(i)));
        for(Future<String> fs : result)
            try{
                System.out.println(fs.get());
            }catch(InterruptedException e){
                System.out.println(e);
                return;
            }catch(ExecutionException e){
                System.out.println(e);
            }finally{
                exec.shutdown();
            }
    }
}

