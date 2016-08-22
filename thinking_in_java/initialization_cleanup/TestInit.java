package org.fmz.init;

class InitializationFirst{
    InitializationFirst(){
        System.out.println("InitializationFirst() constructor");
    }
}

public class TestInit{
    InitializationFirst ifirst = new InitializationFirst();

    public static void main(String args[]){
        System.out.println("After the constructor, then...");
        TestInit ti = new TestInit();
    }
}
