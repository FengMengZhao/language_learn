package org.fmz.reuse;

public class TestA{
    public static void main(String args[]){
        Alpha a = new A();
        a.display();
        Alpha alpha = new Alpha();
        alpha.display();
    }
}

class A extends Alpha{
    public static void display(){
        System.out.println("A");
    }
    public A(){
        System.out.println("A consturctor");
    }
}

class Alpha{
    public static void display(){
        System.out.println("Alpha");
    }
    public Alpha(){
        System.out.println("Alpha constructor");
    }
}

