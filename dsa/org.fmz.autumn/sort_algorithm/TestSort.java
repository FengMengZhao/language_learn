package org.fmz.autumn;

import java.util.*;
import java.util.stream.*;

public class TestSort{
    private static Random rnd = new Random(26);

    public static void display(int[] arr){
    }

    public static void main(String args[]){
        int[] arr = new int[100000];
        for(int i = 0; i < arr.length; i++)
            arr[i] = rnd.nextInt(50);
        System.out.println("Before:");
        System.out.println(Arrays.asList(IntStream.of(arr).boxed().toArray(Integer[]::new)));
        long start_time = System.currentTimeMillis();

        //new BubbleSort().bubbleSort(arr);
        //new SelectionSort().selectionSort(arr);
        //new InsertionSort().insertionSort(arr);
        //new MergeSort().mergeSort(arr);
        //new QuickSort().quickSort(arr);
        new ShellSort().shellSort(arr);

        long end_time = System.currentTimeMillis();
        System.out.println("After:");
        System.out.println(Arrays.asList(IntStream.of(arr).boxed().toArray(Integer[]::new)));
        System.out.println("Time: " + (end_time - start_time));
    }
}
