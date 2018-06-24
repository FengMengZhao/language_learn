package org.fmz.sort;

import java.util.*;

public class TestSort{

    public static void main(String args[]){
        Random random = new Random();

        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println("原始数据：" +  Arrays.toString(arr));

        //BubbleSort.bubbleSort(arr);
        //BubbleSort.bubbleSort2(arr);
        SelectionSort.selectionSort(arr);

        System.out.println("排序后数组：" + Arrays.toString(arr));
    }
}
