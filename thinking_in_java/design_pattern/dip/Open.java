package org.fmz.pattern;

public class Open extends AccountStatus{
    @Override
    public void sendCorrespondence(){
        System.out.println("Status: open...");
    }
}
