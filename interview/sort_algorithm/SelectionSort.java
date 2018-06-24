package org.fmz.sort;

import java.util.*;

public class SelectionSort {

    //从大到小排序
    public static void selectionSort(int[] arr){

        int j = 0;//指示扫描到的位置
        while(j < arr.length - 1){
            int index = 0;//当前最小值光标所在的位置
            int minValue = arr[0];//初始化一个最小值
            for(int i = 1; i < arr.length - j; i++){
                if(arr[i] < minValue){
                    minValue = arr[i];
                    index = i;
                }
            }
            if(index != arr.length - j - 1){
                BubbleSort.swapDataOfIndex(index, arr.length - j - 1, arr);
            }
            j++;
        }
    }
}
