package org.fmz.pattern;

public class Cricket extends Game{
    @Override
    public void initialize(){
        System.out.println("Cricket initializing...");
    }
    @Override
    public void start(){
        System.out.println("Cricket starting...");
    }
    @Override
    public void end(){
        System.out.println("Cricket ended...");
    }
}
