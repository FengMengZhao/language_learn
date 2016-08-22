package org.fmz.init;

public class VarArgs{
    static void f(double d, Character... args){
        System.out.println(d);
        for(Character c : args){
            System.out.print(c + "\t");
        }
    }

    
    static void f(int i, Character... args){
        //System.out.println(i);
        for(Character c : args){
            System.out.print(c + "\n");
        }
    }
    

    public static void main(String args[]){
        f('d', 'f', 'g');
    }
}
