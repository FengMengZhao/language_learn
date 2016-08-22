package org.fmz.hold;

class Basic{

    public Basic(){
        System.out.println("No arguement constructor.");
    }
    public Basic(String str1, String str2){
        System.out.println(str1 + str2);
    }
}

class Sub extends Basic{
    public Sub(String str1, String str2){}
}

public class ExtendsConstructor{
    public static void main(String args[]){
        Basic b = new Sub("Hello", " world!");
    }
}
