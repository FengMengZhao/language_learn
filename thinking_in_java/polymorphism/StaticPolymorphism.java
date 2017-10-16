 package org.fmz.polymorphism ;

class StaticSuper{
    public static void staticGet(){
        System.out.println("Base staticGet()") ;
    }
    public void dynamicGet(){
        System.out.println("Base dynamicGet()") ;
    }
}

class StaticSub extends StaticSuper{
    public static void staticGet(){
        System.out.println("Derived staticGet()") ;
    }
    public void dynamicGet(){
        System.out.println("Derived dynamicGet()") ;
    }
}

public class StaticPolymorphism{
    public static void main(String args[]){
        StaticSuper ssup = new StaticSub() ;
        ssup.staticGet() ;//不会发生多态性
        ssup.dynamicGet() ;
        StaticSub ssub = new StaticSub() ;
        ssub.staticGet() ;//不会发生多态性
        ssub.dynamicGet() ;

    }
}
