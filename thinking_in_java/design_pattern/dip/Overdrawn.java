package org.fmz.pattern;

public class Overdrawn extends AccountStatus{
    @Override
    public void sendCorrespondence(){
        System.out.println("Status: overdrawn!!!");
    }
}
