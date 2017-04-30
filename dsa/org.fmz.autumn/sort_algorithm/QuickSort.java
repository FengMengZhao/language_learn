package org.fmz.autumn;

public class QuickSort{
    public void quickSort(int[] arr){
        if(null == arr || 0 == arr.length)
            return;
        quickSort(arr, 0, arr.length);

    }
    private static void swap(int[] arr, int one, int another){
        int tmp = arr[one];
        arr[one] = arr[another];
        arr[another] = tmp;
    }
    private static void medianOf3(int[] arr, int lo, int hi){
        int mid = (lo + hi) >> 1;
        if(arr[lo] > arr[mid])
            swap(arr, lo, mid);
        if(arr[mid] > arr[hi - 1])
            swap(arr, mid, hi - 1);
        if(arr[lo] > arr[mid])
            swap(arr, lo, mid);
    }

    private static int partition(int[] arr, int lo, int hi){
        int mid = (lo + hi) >> 1;
        int pivot = arr[mid];
        int cursor_left = lo;
        int cursor_right = hi - 1;
        while(true){
            while(arr[cursor_left] < pivot){// attention!!!
                cursor_left++;
            }
            //System.out.println("cursor_left: " + cursor_left);
            while(arr[cursor_right] > pivot){
                cursor_right--;
            }
            //System.out.println("cursor_right: " + cursor_right);
            if(cursor_left > cursor_right)
                break;
            else{
                //System.out.println("cursor_left: " + cursor_left);
                //System.out.println("cursor_right: " + cursor_right);
                swap(arr, cursor_left++, cursor_right--);
            } 
        }
        return cursor_left;
    }

    protected static void quickSort(int[] arr, int lo, int hi){
        if((hi - lo) <= 10){
            int[] tmp = new int[hi - lo];
            System.arraycopy(arr, lo, tmp, 0, tmp.length);
            (new InsertionSort()).insertionSort(tmp);
            System.arraycopy(tmp, 0, arr, lo, hi - lo);
            //new MergeSort().mergeSort(arr, lo, hi);
        }else{
            medianOf3(arr, lo, hi);
            int left_prt = partition(arr, lo, hi);
            quickSort(arr, lo, left_prt);
            quickSort(arr, left_prt, hi);
        }
    }

    public static void main(String args[]){
        int[] arr = new int[]{3, 9, 1, 6, 2, 10, 8, 7, 5, 4, 12, 2, 7, 3, 5, 8, 1, 15, 12};
        quickSort(arr, 0, arr.length);
        for(int i : arr)
            System.out.print(i + ", ");
    }
}

