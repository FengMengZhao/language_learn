package org.fmz.autumn;

import java.util.Random;

public class TestSort{
    static Random rnd = new Random(26);
    public static void main(String args[]){
        int[] arr = new int[20];
        for(int i = 0; i < arr.length; i++)
            arr[i] = rnd.nextInt(10);
        
        System.out.println("Before:");
        for(int i : arr)
            System.out.print(i + ", ");

        //new BubbleSort().bubbleSort(arr);
        //new InsertionSort().insertionSort(arr);
        new SelectionSort().selectionSort(arr);

        System.out.println("\nAfter:");
        for(int i : arr)
            System.out.print(i + ", ");
    }
}
