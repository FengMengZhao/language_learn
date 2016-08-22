package org.fmz.autumn;

public class TestFixedVector{
    public static void main(String args[]){
        Vector v = new FixedVector();
        System.out.println("No arguement Capacity: " + v.capacity());
        v.append(1);
        v.append(1);
        v.append(1);
        v.append('1');
        v.append(1);
        v.append(1);
        v.append(1);
        v.append("fmz");
        v.append(1);
        v.append(1);
        System.out.println(v.size());
        //v.clear();
        System.out.println(v.size());
        v.append("3");
        v.append('3');
        int temp = (int)v.elementAt(0);
        String str =(String)v.elementAt(v.size()-2);
        for(int i=0; i<v.num_items; i++)
            System.out.print(v.elementAt(i) + ", ");
        System.out.println();
        v.remove(3);
        for(int i=0; i<v.num_items; i++)
            System.out.print(v.elementAt(i) + ", ");

        Vector v2 = new FixedVector(10);
        System.out.println("With arguement Vector capacity: " + v2.capacity());
    }
}
