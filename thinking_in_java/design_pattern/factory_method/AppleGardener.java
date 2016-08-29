package org.fmz.pattern;

public class AppleGardener implements FruitGardener{

    @Override
    public Fruit factory(){
        return new Apple();  
    }
}

