package org.fmz.pattern;

public class BinaryObserver extends Observer{
    public BinaryObserver(Subject s){
        subject = s;
        subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
