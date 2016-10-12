package org.fmz.autumn;

public class InsertionSort{
    public void insertionSort(int[] arr){
        for(int pos = 1; pos < arr.length; pos++){
            int cursor = pos;
            while(cursor > 0){
                if(arr[pos] < arr[cursor - 1])
                    cursor--;
                else break;    
            }
            if(cursor != pos){
                int tmp = arr[pos];
                for(int i = pos; i > cursor; i--)
                    arr[i] = arr[i - 1];
                arr[cursor] = tmp;
            }
        }
    }
}
