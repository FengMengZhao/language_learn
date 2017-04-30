package org.fmz.autumn;

public class InsertionSort{
    public void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int cursor = i;
            int min = arr[i];
            while(cursor > 0){
                if(arr[cursor - 1] < min)
                    cursor--;
                else break;
            }

            if(cursor != i){
                for(int j = i; j > cursor; j--)
                    arr[j] = arr[j - 1];
                arr[cursor] = min;
            }
        }
    }
}
