package org.fmz.pattern;

public class Checking extends AccountType{
    @Override
    public void deposit(float amt){
        System.out.println("Checking: " + amt);
    }
}
