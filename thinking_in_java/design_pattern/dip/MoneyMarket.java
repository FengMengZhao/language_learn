package org.fmz.pattern;

public class MoneyMarket extends AccountType{
    public void deposit(float amt){
        System.out.println("MoneyMarket: " + amt);
    }
}
