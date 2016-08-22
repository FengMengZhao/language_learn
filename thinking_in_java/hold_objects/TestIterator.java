package org.fmz.hold;

import java.util.*;

class B{
    public String toString(){
        return "B identical";
    }
}

public class TestIterator{

    public static void display(Collection<A> coll){
        Iterator<A> it = coll.iterator();
        while(it.hasNext())
            System.out.print(it.next() + "\t");
    }
    public static void main(String args[]){
        A[] array_A = {new A(), new A(), new A(), new A(), new A(), new A()};
        B[] array_B = {new B(), new B(), new B(), new B(), new B(), new B()};
        Collection arrayList = new ArrayList(Arrays.asList(array_A));
        Collection linkedList = new LinkedList(arrayList);
        Collection hashSet = new HashSet(arrayList);
        //Collection treeSet = new TreeSet(arrayList);
        display(arrayList);
        System.out.println();
        display(linkedList);
        System.out.println();
        display(hashSet);
        System.out.println();
        //display(treeSet);
        Collection arrayListB = new ArrayList(Arrays.asList(array_B));
        Collection linkedListB = new LinkedList(arrayListB);
        Collection hashSetB = new HashSet(arrayListB);
        //Collection treeSet = new TreeSet(arrayList);
        display(arrayListB);
        System.out.println();
        display(linkedListB);
        System.out.println();
        display(hashSetB);
        //display(treeSet);
    }
}
