package org.fmz.autumn;

public class MergeSort{
    public void mergeSort(int[] arr){
        mergeSort(arr, 0, arr.length);
    }

    public void mergeSort(int[] arr, int lo, int hi){
        int mid = (lo + hi) >> 1;

        mergeSort(arr, lo, mid);
        mergeSort(arr, mid, hi);
        merge(arr, lo, mid, hi);
    }

    public void merge(int[] arr, int lo, int mid, int hi){
        int[] left = new int[mid - lo + 1];
        int[] right = new int[hi - mid + 1];

        System.arraycopy(arr, lo, left, 0, left.length -1);
        left[left.length - 1] = Integer.MAX_VALUE;
        System.arraycopy(arr, mid, right, 0, right.length - 1);
        right[right.length - 1] = Integer.MAX_VALUE;

        int i = 0,
            j = 0;
        for(int k = lo; k < hi; k++){
            if(left[i] < right[j])
                arr[k] = left[i++];
            else
                arr[k] = right[i++];
        }
    }
}
