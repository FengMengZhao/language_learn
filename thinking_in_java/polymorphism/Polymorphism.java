package org.fmz.polymorphism;

class Base{
    void play(int a){
        System.out.println(a/2);
    }
}

class Derived1 extends Base{
    void play(int a){
        System.out.println(a/3);
    }
}

class Derived2 extends Base{
    void play(int a){
        System.out.println(a/0);
    }
}

public class Polymorphism{
    public static void compute(Base b, int i){
        b.play(i);
    }

    public static int divideByZero(){
        return 1/0;
    }

    public static void main(String args[]){
        compute(new Derived2(), 11);
        //int a = divideByZero(10);
    }
}
