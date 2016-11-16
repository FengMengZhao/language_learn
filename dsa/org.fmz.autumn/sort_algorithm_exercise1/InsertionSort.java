package org.fmz.autumn;

public class InsertionSort{
    public void insertionSort(int[] arr){
        for(int pos = 1; pos < arr.length; pos++){
            int cursor = pos;
            int min = arr[pos]
            while(cursor > 0){
                if(min < arr[cursor - 1])
                    cursor--;
                else break;    
            }
            if(cursor != pos){
                for(int i = pos; i > cursor; i--)
                    arr[i] = arr[i - 1];
                arr[cursor] = min;
            }
        }
    }
}
