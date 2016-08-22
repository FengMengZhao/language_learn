package org.fmz.reuse;

public class Child extends Super{
    public static void main(String args[]){
        System.out.println("This is the Child");
        // This allows easy testing for each class
        String[] hello = {"hello", "cll"};
        Super.main(hello);
    }
}
