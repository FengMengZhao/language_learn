package org.fmz.autumn;

public class TestFixedVector{
    public static void main(String args[]){
        Vector<Integer> v = new FixedVector<Integer>();
        System.out.println("No arguement Capacity: " + v.capacity());
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
        System.out.println(v.size());
        //v.clear();
        System.out.println(v.size());
        //v.append("3");
        //v.append('3');
        int temp = v.elementAt(0);
        //String str = v.elementAt(v.size()-2);
        for(int i=0; i<v.num_items; i++)
            System.out.print(v.elementAt(i) + ", ");
        System.out.println();
        v.remove(3);
        for(int i=0; i<v.num_items; i++)
            System.out.print(v.elementAt(i) + ", ");

        Vector<Integer> v2 = new FixedVector<Integer>(10);
        v2.append(0);
        v2.append(1);
        v2.append(2);
        v2.append(3);
        v2.append(10);
        v2.append(9);
        v2.append(null);
        v2.append(19);
        v2.append(19);
        v2.append(19);
        System.out.println("With arguement Vector capacity: " + v2.capacity());
        System.out.println("foreach output:");
        for(Integer I : v2)
            System.out.print(I + "\t");
        System.out.println("v2 contains null: " + v2.contains(null));
        v2.remove(null);
        for(Integer I : v2)
            System.out.print(I + "\t");
        System.out.println("v2 contains null: " + v2.contains(null));
    }
}
