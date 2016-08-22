package org.fmz.generics;

import java.util.*;

public class CoffeeGeneratorAnonymousInnerClass implements Generator<Coffee>, Iterable<Coffee>{

    private static Random rand = new Random(26);

    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class,
                               Americano.class, Breve.class};
    private int size;

    public CoffeeGeneratorAnonymousInnerClass(){}
    public CoffeeGeneratorAnonymousInnerClass(int sz){size = sz;}
    
    public Coffee next(){
        try{
            return (Coffee)types[rand.nextInt(types.length)].newInstance();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    /*
    class CoffeeIterator implements Iterator<Coffee>{
        int count = size;

        public boolean hasNext(){return count > 0;};

        public Coffee next(){
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove(){throw new UnsupportedOperationException();}
    }
    */

    public Iterator<Coffee> iterator(){
        return new Iterator<Coffee>(){
            int count = size;
            public boolean hasNext(){return count > 0;}
            public Coffee next(){
                count--;
                // compile error 
                //return next();
                return CoffeeGeneratorAnonymousInnerClass.this.next();// this is right: OuterClass.this to get the OuterClass reference
            }
            public void remove(){throw new UnsupportedOperationException();}
        };
    }


    public static void main(String args[]){
        // compile error
        //Generator gen = new CoffeeGeneratorAnonymousInnerClass();
        Generator gen = new CoffeeGeneratorAnonymousInnerClass();
        for(int i = 0; i < 15; i++)
            System.out.println(gen.next());
        for(Coffee c : new CoffeeGeneratorAnonymousInnerClass(15))
            System.out.println(c);
   }
}
