package org.fmz.algorithm ;

import java.util.* ;

public class TestArrayReturn{
	public static void array(Integer[] array){
		for(int i=0; i<array.length; i++){
			array[i] = -1 ;
		}
	}

	public static void main(String args[]){
		Random rand = new Random(25) ;
		Integer[] array = new Integer[10] ;
		Arrays.fill(array, rand.nextInt(10)) ;
		System.out.println(Arrays.asList(array)) ;
		array(array) ;
		System.out.println(Arrays.asList(array)) ;
	}
}