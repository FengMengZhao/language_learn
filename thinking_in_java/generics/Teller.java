package org.fmz.generics;

public class Teller{
    private static long counter = 0;
    private final long id = counter++;
    public String toString(){
        return "Teller " + id;
    }

    public static Generator<Teller> generator(){
        return new Generator<Teller>(){
            public Teller next(){
                return new Teller();
            }
        };
    }
}
