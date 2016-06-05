package org.fmz.algorithm ;

import java.util.* ;

public class HeapSort{
	public static int parent(int i){
		return  i / 2 ;
	}

	public static int left(int i){
		return 2 * i ;
	}

	public static int right(int i){
		return 2 * i + 1 ;
	}

	public static void maxHeapify(Integer[] array, int i){
		Integer[] array_move_index = new Integer[array.length + 1] ;
		for(int j = 1; j<array_move_index.length; j++){
			array_move_index[j] = array[j-1] ;
		}
		int l = left(i) ;
		int r = right(i) ;
		int largest ;
		if(array_move_index[l] > array_move_index[i]){
			largest = l ;
		}else if(array_move_index[r] > array_move_index[i]){
			largest = r ;
		}else{
			largest = i ;
		}
		if(largest != i){
			int temp_exchange = array_move_index[i] ;
			array_move_index[i] = array_move_index[largest] ;
			array_move_index[largest] = temp_exchange ;
			for(int j = 0; j<array.length; j++){
				array[j] = array_move_index[j+1] ;
			}
		}
	}

	public static void buildMaxHeap(Integer[][] array){
		
	}

	public static void main(String args[]){
		Integer[] array = {16, 4, 10, 14, 7, 9, 3, 2, 8, 1} ;
		System.out.println(Arrays.asList(array)) ;
		maxHeapify(array, 2) ;
		System.out.println(Arrays.asList(array)) ;
	}
}