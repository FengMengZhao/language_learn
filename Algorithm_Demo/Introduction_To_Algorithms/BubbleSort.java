package org.fmz.algorithm ;

import java.util.* ;

public class BubbleSort{
	public static Integer[] bubbleSort(Integer[] array){
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[j] < array[i]){
					int temp = array[i] ;
					array[i] = array[j] ;
					array[j] = temp ;
				}
			}
		}
		return array ;
	}

	public static void main(String args[]){
		Random random = new Random(25) ;
		Integer[] array = new Integer[100000] ;
		for(int i=0;i<array.length;i++){
			array[i] = random.nextInt(1000) ;
		}
		System.out.println(Arrays.asList(array)) ;
		bubbleSort(array) ;
		System.out.println(Arrays.asList(array)) ;
	}
}