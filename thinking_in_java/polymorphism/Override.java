package org.fmz.polymorphism;

class A{
    void play(int a){
        System.out.println(a);
    }
}



public class Override extends A{
    public void play(int a){
        System.out.println("child" + a);
        //return a;
    }

    public static void main(String args[]){
        A over = new Override();
        over.play(11);
    }
}
