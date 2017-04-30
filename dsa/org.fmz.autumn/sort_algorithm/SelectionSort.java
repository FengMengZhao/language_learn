package org.fmz.autumn;

public class SelectionSort{
    public void selectionSort(int[] arr){
        if(null == arr || 0 == arr.length) 
            return;
        int len = arr.length;
        int pos = 0;
        while(pos < arr.length){
            int min = arr[pos];
            int cursor = pos;
            for(int i = pos + 1; i < len; i++){
                if(arr[i] < min) {
                    min = arr[i];
                    cursor = i;
                }
            }
            if(pos != cursor){
                int tmp = arr[pos];
                arr[pos] = arr[cursor];
                arr[cursor] = tmp;
            }
            pos++;
        }
    }
}
