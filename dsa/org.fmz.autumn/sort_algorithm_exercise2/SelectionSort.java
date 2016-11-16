package org.fmz.autumn;

public class SelectionSort{
    public void selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int cursor = i;
            int min = arr[cursor];
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    cursor = j;
                }
            }

            if(cursor != i){
                int tmp = arr[i];
                arr[i] = arr[cursor];
                arr[cursor] = tmp;
            }
        }
    }
}
