package org.fmz.pattern;

public class FruitGardenerTest{

    public static void main(String args[]){
        try{
            Fruit apple = FruitGardener.factory("Apple");
            apple.grow();
            Fruit grape = FruitGardener.factory("Grape");
            grape.plant();
            Fruit strawberry = FruitGardener.factory("Strawberry");
            strawberry.harvest();
            Fruit strawberry2 = FruitGardener.factory("Strawberry2");
        }catch(BadFruitException e){
            e.printStackTrace();
        }
    }
}
