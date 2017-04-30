package org.fmz.autumn;

public class SelectionSort{
    public void selectionSort(int[] arr){
        for(int pos = 0; pos < arr.length; pos++){
            int min = Integer.MAX_VALUE;
            int index = 0;
            int cursor = pos;
            while(cursor < arr.length){
                if(arr[cursor] < min){
                    min = arr[cursor];
                    index = cursor;
                }
                cursor++;
            }
            if(pos != index){
                int tmp = arr[index];
                arr[index] = arr[pos];
                arr[pos] = tmp;
            }
        }
    }
}
