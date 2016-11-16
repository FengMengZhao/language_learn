package org.fmz.pattern;

public class Football extends Game{
    @Override
    public void initialize(){
        System.out.println("Football initializing...");
    }
    @Override
    public void start(){
        System.out.println("Football starting...");
    }
    @Override
    public void end(){
        System.out.println("Football ended...");
    }
}
