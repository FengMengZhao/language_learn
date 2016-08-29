package org.fmz.pattern;

public class GrapeGardener implements FruitGardener{

    @Override
    public Fruit factory(){
        return new Grape();  
    }
}

