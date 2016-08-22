package org.fmz.rtti;

import java.util.*;

class Initable{
    static final int static_final = 4 - 2;// the compile-time constant
    static final int static_final_2 = 
        ClassInitialization.rand.nextInt(1000);// is not a compile-time constant,is the run-time constant
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2{
    static int static_not_final = 12;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3{
    static int static_not_final = 22;
    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization{
    public static Random rand = new Random(26);
    public static void main(String args[])throws Exception{
        Class initable = Initable.class;
        System.out.println("After creating Initable reference");
        System.out.println(Initable.static_final);
        System.out.println(Initable.static_final_2);
        System.out.println(Initable2.static_not_final);
        Class initable3 = Class.forName("org.fmz.rtti.Initable3");
        System.out.println("After creating Initable3 reference");
        System.out.println(Initable3.static_not_final);
    }
}
