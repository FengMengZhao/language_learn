package org.fmz.init;

public class TestStaticAccess{
    public static void main(String args[]){
        System.out.println(new SubA().id);
    }
}

class A{
    static{
        System.out.println("I am static area in base clas");
    }

    public A(){
        System.out.println("A constructor");
    }
}

class SubA extends A{
    static int id = 100;
    public SubA(){
        System.out.println("SubA constructor");
    }
    static{
        System.out.println("I am static area in sub class");
    }
}
