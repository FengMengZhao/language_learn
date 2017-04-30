package org.fmz.pattern;

public class FruitGardenerTest{

    public static void main(String args[]){
       
        FruitGardener gardener = new AppleGardener();
        gardener = new GrapeGardener();
        gardener = new StrawberryGardener();
        Fruit f = gardener.factory();
        f.grow();
        f.plant();
        f.plant();

        /*
        FruitGardener gardener = FruitGardener.getGardener("org.fmz.pattern.AppleGardener");
        Fruit f = gardener.factory();
        f.grow();
        f.plant();
        f.plant();
        */
    }
}
