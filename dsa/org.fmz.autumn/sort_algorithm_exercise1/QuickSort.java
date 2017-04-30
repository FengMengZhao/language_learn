package org.fmz.autumn;

public class QuickSort{
    public void quickSort(int[] arr){

    }

    protected void swap(int[] arr, int one, int another){
        int tmp = arr[one];
        arr[one] = arr[another];
        arr[another] = tmp;
    }
    protected void mediaOf3(int[] arr, int lo, int hi){
        int mid = (lo + hi) >> 1;
        if(arr[lo] > arr[mid])
            swap(arr, lo, mid);
        if(arr[mid] > arr[hi - 1])
            swap(arr, mid, hi - 1]);
        if(arr[lo] > arr[mid])
            swap(arr, lo, mid);
    }

    protected int partition(int[] arr, int lo, int hi){
        int mid = (lo + hi) >> 1,
            pivot = arr[mid],
            left_cursor = lo,
            right_cursor = hi - 1; 
        while(true){
            while(arr[left_cursor] < pivot) left_cursor++;
            while(arr[right_cursor] > pivot) right_cursor--;
            if(left_cursor > right_cursor) break;
            else
                swap(arr, left_cursor++, right_cursor--);
        }
        return left_cursor;
    }

    protected void quickSort(int[] arr, int lo, int hi){
        if(hi - lo <= 10){
            int[] tmp = new int[li - lo];
            System.arraycopy(arr, lo, tmp, 0, tmp.length);
            new SelectionSort().selectionSort(tmp);
            System.arraycopy(tmp, 0, arr, lo, tmp.length);
        }

        mediaOf3(arr, lo, hi);
        int left_prt = partition(arr, lo, hi);
        quickSort(arr, lo, left_prt);
        quickSort(arr, left_prt, hi);
    }
}
