package org.fmz.pattern;

public class Saving extends AccountType{
    @Override
    public void deposit(float amt){
        System.out.println("Saving: " + amt);
    }
}
