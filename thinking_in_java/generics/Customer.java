package org.fmz.generics;

public class Customer{
    private static long counter = 0;
    private final long id = counter++;
    public String toString(){
        return "Customer " + id;
    }

    public static Generator<Customer> generator(){
        return new Generator<Customer>(){
            public Customer next(){
                return new Customer();
            }
        };
    }
}
