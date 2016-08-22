package org.fmz.autumn;

public class TestDynamicVector{
    public static void main(String args[]){
        Vector<Integer> v = new DynamicVector<Integer>(10);
        //Vector v = new DynamicVector(10);
        System.out.println("With arguement Capacity: " + v.capacity());
        v.append(1);
        v.append(1);
        v.append(1);
        v.append(1);
        v.append(1);
        v.append(1);
        //v.append("1");
        v.append(1);
        v.append(1);
        v.append(1);
        v.append(10);
        v.append(100);
        v.append(1000);

        Vector<Integer> v2 = new DynamicVector<Integer>();
        System.out.println("No arguement Capacity: " + v2.capacity());
        System.out.println("foreach output:");
        for(Integer I : v)
            System.out.print(I + "\t");
    }
}
