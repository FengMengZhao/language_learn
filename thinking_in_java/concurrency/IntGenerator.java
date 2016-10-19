package org.fmz.concurrency;

public abstract class IntGenerator{
    private volatile boolean flag;
    //private boolean flag;
    public abstract int next();
    public void cancle(){
        flag = true;
    }
    public boolean isCancled(){
        return flag;
    }
}
