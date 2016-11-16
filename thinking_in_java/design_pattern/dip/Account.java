package org.fmz.pattern;

public class Account{
    private AccountType acct_type;
    private AccountStatus acct_status;

    public Account(AccountType at){
        acct_type = at;
    }

    public void deposit(float amt){
        Systme.out.println("Depositing: " + amt);
    }
}
