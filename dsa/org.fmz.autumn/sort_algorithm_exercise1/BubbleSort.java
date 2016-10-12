package org.fmz.autumn;
public class BubbleSort{
    public void bubbleSort(int[] arr){
        boolean sorted = false;
        int pos = arr.length;
        while(sorted = !sorted){
            for(int cursor = 0; cursor < pos - 1; cursor++){
                if(arr[cursor] > arr[cursor + 1]){
                    int tmp = arr[cursor];
                    arr[cursor] = arr[cursor + 1];
                    arr[cursor + 1] = tmp;
                    sorted = false;
                }
            }
            pos--;
        }
    }
}
