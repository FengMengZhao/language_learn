package org.fmz.pattern;

public class FruitGardener{

    public static Fruit factory(String which) throws BadFruitException{
        switch(which.toLowerCase()){
            case "apple":
                return new Apple();
            case "grape":
                return new Grape();
            case "strawberry":
                return new Strawberry();
            default:
                throw new BadFruitException("Bad fruit request");
        }
    }
}
