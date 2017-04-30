package org.fmz.pattern;

public class HexaObserver extends Observer{
    public HexaObserver(Subject s){
        subject = s;
        subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Hexa String: " + Integer.toHexString(subject.getState()));
    }
}
