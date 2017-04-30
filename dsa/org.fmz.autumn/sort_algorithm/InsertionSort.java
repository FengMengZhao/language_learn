package org.fmz.autumn;

public class InsertionSort{
    public void insertionSort(int[] arr){
        if(null == arr || 0 == arr.length)
            return;
        int len = arr.length;
        for(int pos = 1; pos < len; pos++){
            int cursor = pos - 1;
            while(cursor >= 0){
                if(arr[pos] < arr[cursor])
                    cursor--;
                else break;
            }
            cursor++;
            if(cursor != pos){
                int tmp = arr[pos];
                for(int i = pos; i > cursor; i--)
                    arr[i] = arr[i - 1];
                arr[cursor] = tmp;
            }
        }
    }

    public static void main(String args[]){
        int[] arr = new int[]{3, 9, 1, 6, 2, 10, 8, 7, 5, 4};
        new InsertionSort().insertionSort(arr);
        for(int i : arr)
            System.out.print(i + ", ");
    }
}
