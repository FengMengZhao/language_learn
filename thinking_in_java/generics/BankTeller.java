package org.fmz.generics;

import java.util.*;

public class BankTeller{
    private static Random rand = new Random(26);
    public static void serve(Teller t, Customer c){
        System.out.println(t + " serves " + c);
    }

    public static void main(String args[]){
        Queue<Customer> line = new LinkedList<Customer>();
        Generators.fill(line, Customer.generator(), 15);
        List<Teller> tellers = new ArrayList<Teller>();
        Generators.fill(tellers, Teller.generator(), 5);
        for(Customer c : line)
            serve(tellers.get(rand.nextInt(tellers.size())), c);
    }
}
