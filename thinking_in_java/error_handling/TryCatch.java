package org.fmz.error;

public class TryCatch{
    public static void main(String args[]){
        for(int i=10; i>-10; i--){
            try{
                System.out.println(10 / i);
            }catch(Exception e){
                System.out.println("0 can not be divided");
            }
        }
    }
}
