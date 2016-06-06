package org.fmz.algorithm ;

import java.util.* ;

public class InsertionSort{
	public static Integer[] insertionSort(Integer[] array){
		for(int j=1;j<array.length;j++){
			Integer insertValue = array[j] ;
			int i = j - 1 ;
			while(i >= 0 && array[i] > insertValue){
				array[i+1] = array[i] ;
				i-- ;
			}
			array[i+1] = insertValue ;
		}
		return array ;
	}

	public static Double[] insertionSort(Double[] array){
		for(int j=1;j<array.length;j++){
			Double insertValue = array[j] ;
			int i = j - 1 ;
			while(i >= 0 && array[i] > insertValue){
				array[i+1] = array[i] ;
				i-- ;
			}
			array[i+1] = insertValue ;
		}
		return array ;
	}

	public static void main(String args[]){
		Random random = new Random(26) ;
		Integer[] array = new Integer[100000] ;
		for(int i=0;i<array.length;i++){
			array[i] = random.nextInt(1000) ;
		}
		System.out.println(Arrays.asList(array)) ;
		long startTime = System.currentTimeMillis() ;
		insertionSort(array) ;
		System.out.println(Arrays.asList(array)) ;
		long endTime = System.currentTimeMillis() ;
		System.out.println(endTime - startTime) ;
	}
}/**
   *对于插入排序算法，排序10,000个数的数组需要33毫秒；排序100,000个数的数组需要4098毫秒
   *对于Arrays.sort()算法，排序10,000个数的数组需要21毫秒；排序100,000个数的数组需要60毫秒；排序1,000,000个数的数组需要504毫秒；排序10,000,000个数的数组需要2331毫秒
   *对于分治排序算法，排序10,000个数的数组需要26毫秒；排序100,000个数的数组需要46毫秒；排序1,000,000个数的数组需要311毫秒；排序10,000,000个数的数组需要4728毫秒
   */