package org.fmz.algorithm ;

import java.util.* ;

public class MergeSort{
	private static void merge(Integer[] array ,int start, int middle, int end){
		int n1 = middle - start + 1 ;
		int n2 = end - middle ;
		Integer[] left = new Integer[n1 + 1] ;
		Integer[] right = new Integer[n2 + 1] ;
		for(int i=0;i<n1;i++){
			left[i] = array[start + i] ;
		}
		for(int j=0;j<n2;j++){
			right[j] = array[middle + j + 1] ;
		}
		left[n1] = Integer.MAX_VALUE ;
		right[n2] = Integer.MAX_VALUE ;
		int i = 0 ;
		int j = 0 ;
		for(int k=start;k<=end;k++){
			if(left[i] < right[j]){
				array[k] = left[i] ;
				i++ ;
			}else{
				array[k] = right[j] ;
				j++ ;
			}
		}
	}
	public static Integer[] mergeSort(Integer[] array, int start, int end){
		if(start < end){
			int middle = (start + end) / 2 ;
			mergeSort(array, start, middle) ;
			mergeSort(array, middle+1, end) ;
			merge(array, start, middle, end) ;
		}
		return array ;
	}

	public static void main(String args[]){
		Random random = new Random(25) ;
		Integer[] array = new Integer[1000000] ;
		for(int i=0;i<array.length;i++){
			array[i] = random.nextInt(1000) ;
		}
		long startTime = System.currentTimeMillis() ;
		System.out.println(Arrays.asList(mergeSort(array, 0, array.length-1))) ;
		long endTime = System.currentTimeMillis() ;
		System.out.println(endTime - startTime) ;

	}
}/**
   *对于插入排序算法，排序10,000个数的数组需要33毫秒；排序100,000个数的数组需要4098毫秒
   *对于Arrays.sort()算法，排序10,000个数的数组需要21毫秒；排序100,000个数的数组需要60毫秒；排序1,000,000个数的数组需要504毫秒；排序10,000,000个数的数组需要2331毫秒
   *对于分治排序算法，排序10,000个数的数组需要26毫秒；排序100,000个数的数组需要46毫秒；排序1,000,000个数的数组需要311毫秒；排序10,000,000个数的数组需要4728毫秒
   */