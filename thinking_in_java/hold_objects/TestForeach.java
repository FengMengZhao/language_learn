package org.fmz.hold;

import java.util.Arrays;

class A{
    private static long counter = 0;
    private final long id = counter++;
    public String toString(){
        return "A " + id;
    }
}

public class TestForeach{
    public static void main(String args[]){
        A[] arr = {new A(), new A(), new A(), new A()};

        for(A a : arr){
            System.out.print(a + "\t");
        }

        System.out.println(Arrays.asList(arr));
    }
}
