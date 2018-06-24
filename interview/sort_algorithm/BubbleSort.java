package org.fmz.sort;

import java.util.Arrays;

public class BubbleSort {

    //从大到小达排序
    public static void bubbleSort(int[] arr){
        int j = 1;
        while(j < arr.length - 1){
            for(int i = 0; i < arr.length - j; i++){
                if(arr[i] < arr[i+1]){
                    swapDataOfIndex(i, i+1, arr);
                }
            }
            j++;
        }
    }

    public static void bubbleSort2(int[] arr){
        boolean sorted = false;
        int j = 1;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < arr.length - j; i++){
                if(arr[i] < arr[i+1]){
                    swapDataOfIndex(i, i+1, arr);
                    sorted = false;
                }
            }
            j++;
        }
    }


    public static void swapDataOfIndex(int one, int another, int[] arr){
        int tmp = arr[one];
        arr[one] = arr[another];
        arr[another] = tmp;
    }
}
