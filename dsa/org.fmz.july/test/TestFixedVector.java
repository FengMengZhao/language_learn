package org.fmz.july;

public class TestFixedVector{
    
    public static void main(String args[]){
        FixedVector vector = new FixedVector(4);

        vector.append("fmz");
        System.out.println(vector.elementAt(0));
        System.out.println(vector.elementAt(1));
    }
}
