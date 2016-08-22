package org.fmz.polymorphism;

class Characteristic{
    private String s;
    Characteristic(String s){
        this.s = s;
        System.out.println("Creating Characteristic: " + s);
    }
    protected void dispose(){
        System.out.println("Disposing Characteristic: " + s);
    }
}

class Description{
    private String s;
    Description(String s){
        this.s = s;
        System.out.println("Creating Description: " + s);
    }
    protected void dispose(){
        System.out.println("Disposing Description: " + s);
    }
}

class LivingCreature{
    private Characteristic c
        = new Characteristic("is alive");
    private Description d
        = new Description("Basic living creature");
    LivingCreature(){
        System.out.println("LivingCreature()");
    }
    protected void dispose(){
        System.out.println("Disposing LivingCreature");
        d.dispose();
        c.dispose();
    }
}

class Animal extends LivingCreature{
    private Characteristic c
        = new Characteristic("has heart");
    private Description d
        = new Description("animal not vegetable");
    Animal(){
        System.out.println("Animal()");
    }
    protected void dispose(){
        System.out.println("Disposing Animal");
        d.dispose();
        c.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal{
    private Characteristic c
        = new Characteristic("can linv in water");
    private Description d
        = new Description("both water and land");
    Amphibian(){
        System.out.println("Amphibian()");
    }
    protected void dispose(){
        System.out.println("Disposing Amphibian");
        d.dispose();
        c.dispose();
        super.dispose();
    }
}

public class Frog extends Amphibian{
    private Characteristic c
        = new Characteristic("croaks");
    private Description d
        = new Description("eat eggs");
    Frog(){
        System.out.println("Frog()");
    }
    protected void dispose(){
        System.out.println("Disposing Frog");

        d.dispose();
        c.dispose();
        super.dispose();
    }
    
    public static void main(String args[]){
        Frog f = new Frog();
        System.out.println("Bye!");
        f.dispose();
    }
}
