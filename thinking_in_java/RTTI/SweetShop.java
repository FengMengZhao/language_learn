package org.fmz.rtti;

class Candy{
    static {
        System.out.println("Loading Candy");
    }

    public Candy(){
        System.out.println("Creating Candy");
    }
}

class Gum{
    static {
        System.out.println("Loading Gum");
    }

    public Gum(){
        System.out.println("Creating Gum");
    }
}

class Cookie{
    static {
        System.out.println("Loading Cookie");
    }

    public Cookie(){
        System.out.println("Creating Cookie");
    }
}

public class SweetShop{
    public static void main(String args[]){
        System.out.println("Inside mian()");
        new Candy();
        System.out.println("After creating Candy");
        // this is strange, should find the class, but not
        try{
            Class.forName("org.fmz.rtti.Gum");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Can't find Gum");
        }
        System.out.println("After Loading Gum, but not creating");
        new Gum();
        System.out.println("After creating Gum");
        new Cookie();
        System.out.println("After creating cookie");
    }
}

