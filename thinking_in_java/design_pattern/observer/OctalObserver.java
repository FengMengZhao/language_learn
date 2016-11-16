package org.fmz.pattern;

public class OctalObserver extends Observer{
    public OctalObserver(Subject s){
        subject = s;
        subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
