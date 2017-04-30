package org.fmz.autumn;

public class BubbleSort{
    public void bubbleSort(int[] arr){
        if(null == arr || 0 == arr.length)
            return;
        boolean sorted = false;
        int j = arr.length;
        while(sorted = !sorted){
            for(int i = 0; i < j - 1; i++){
                if(arr[i] > arr[i + 1]){
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    sorted = false;
                }
            }
            j--;
        }
    }
}
