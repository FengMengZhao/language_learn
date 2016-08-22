package org.fmz.autumn;

public class TestDynamicVector{
    public static void main(String args[]){
        Vector v = new DynamicVector(10);
        System.out.println("With arguement Capacity: " + v.capacity());
        v.append(1);
        v.append(1);
        v.append(1);
        v.append(1);
        v.append(1);
        v.append(1);
        v.append(1);
        v.append(1);
        v.append(1);
        v.append(1);
        System.out.println(v.isFull());
        System.out.println(v.size());
        //v.append(3);
        System.out.println(v.data.length);
        System.out.println(v.insertAt(v.num_items, 4));
        System.out.println(v.size());

        Vector v2 = new DynamicVector();
        System.out.println("No arguement Capacity: " + v2.capacity());
    }
}
