package org.fmz.generics;

import java.util.*;

public class CoffeeGenerator_0810 implements Generator_0810<Coffee>, Iterable<Coffee>{
    private static Class[] types = {
        Latte.class, Mocha.class,
        Breve.class, Americano.class, Cappuccino.class};
    private static Random rand = new Random(26);

    private int size;

    public CoffeeGenerator_0810(){}
    public CoffeeGenerator_0810(int sz){size = sz;}

    public Coffee next(){
        try{
            return (Coffee)types[rand.nextInt(types.length)].newInstance();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    // this method can only foreach once
    /*
    public Iterator<Coffee> iterator(){
        return new Iterator<Coffee>(){
            public boolean hasNext(){return size > 0;}
            public Coffee next(){
                size--;
                return CoffeeGenerator_0810.this.next();
            }
            public void remove(){throw new UnsupportedOperationException();}
        };
    }
    */

    /*
     * when you use new count variable then
     * the generator object you can foreach more times
     * if you use the origin size
     * the generator object you can foreach once, because after foreach the size=0
     */
    public Iterator<Coffee> iterator(){
        return new Iterator<Coffee>(){
            int count = size;
            public boolean hasNext(){return count > 0;}
            public Coffee next(){
                count--;
                return CoffeeGenerator_0810.this.next();
                //return next();
            }
            public void remove(){throw new UnsupportedOperationException();}
        };
    }


    public static void main(String args[]){
        CoffeeGenerator_0810 generator = new CoffeeGenerator_0810();
        for(int i = 0; i < 10; i++)
            System.out.println(generator.next());
        System.out.println("**********************");


        CoffeeGenerator_0810 generator2 = new CoffeeGenerator_0810(15);
        for(Coffee c : generator2)
            System.out.println(c);
    }
}
