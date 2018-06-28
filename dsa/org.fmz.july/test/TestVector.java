package org.fmz.july;

public class TestVector{
    
    public static void main(String args[]){
        Vector vector = new Vector();

        vector.append("fmz");
        vector.append(2);
        System.out.println(vector.size());
        System.out.println(vector.indexOf("fmz"));
        System.out.println(vector.indexOf(0));
        vector.insertAt(0, "cll");
        System.out.println(vector.size());
        System.out.println(vector.elementAt(0));
    }
}
