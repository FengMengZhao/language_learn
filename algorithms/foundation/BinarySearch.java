package org.fmz.algorithm;

public class BinarySearch{
    public int binarySearch(int key, int[] arr){
        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = (lo + hi) >> 1;
            if(key < arr[mid]) hi = mid - 1;
            else if (key > arr[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public int binarySearchRecurse(int key, int[] arr){
        return binarySearchRecurse(key, arr, 0, arr.length - 1);
    }

    public int binarySearchRecurse(int key, int[] arr, int lo, int hi){
        if(lo > hi) return -1;
        int mid = (lo + hi) >> 1;
        if(key < arr[mid]) return binarySearchRecurse(key, arr, lo, mid - 1);
        else if(key > arr[mid]) return binarySearchRecurse(key, arr, mid + 1, hi);
        else return mid;
    }

    public static void main(String args[]){
        //System.out.println(new BinarySearch().binarySearch(5, new int[]{1, 2, 3, 4, 5}));
        //System.out.println(new BinarySearch().binarySearchRecurse(5, new int[]{1, 2, 3, 4, 5}));
        //System.out.println(1 / 0);
        for(int i = 0; i < 5; i++) System.out.println(i);

    }
}
