package org.fmz.pattern;

public class RealSubject implements Subject{

    @Override
    public void request(){
        System.out.println("=====RealSubjcet Request=====");
    }
}
