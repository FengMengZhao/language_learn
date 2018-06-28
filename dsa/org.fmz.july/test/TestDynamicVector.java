package org.fmz.july;

public class TestDynamicVector{
    
    public static void main(String args[]){
        DynamicVector vector = new DynamicVector(4);

        vector.append("fmz");
        vector.append("fmz");
        vector.append("fmz");
        vector.append("fmz");
        vector.append("fmz");
        System.out.println(vector.elementAt(4));
    }
}
