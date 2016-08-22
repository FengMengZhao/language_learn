package org.fmz.init;
public class CharDefaultInit{
    char c;
    void printInit(){
        System.out.println("Char c : [" + (int)c +"]");
    }

    public static void main(String args[]){
        CharDefaultInit cdi = new CharDefaultInit();
        cdi.printInit();
        System.out.println((char)0);
    }
}
