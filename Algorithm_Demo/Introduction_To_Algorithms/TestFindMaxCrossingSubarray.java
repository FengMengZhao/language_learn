package org.fmz.algorithm ;

import java.io.* ;

import java.util.* ;

public class TestFindMaxCrossingSubarray{
	public static void main(String args[]){
		Integer[] stockDifferToPrevious = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7} ;
		FindMaxCrossingSubarray fmcs = new FindMaxCrossingSubarray() ;
		int low = 0 ;
		int high = stockDifferToPrevious.length-1 ;
		int middle = stockDifferToPrevious.length / 2 ;
		fmcs.findMaxCrossingSubarray(stockDifferToPrevious, low, middle ,high) ;
		System.out.println("max_left: " + fmcs.max_left) ;
		System.out.println("max_right: " + fmcs.max_right) ;
		System.out.println("sum_left: " + fmcs.sum_left) ;
		System.out.println("sum_right: " + fmcs.sum_right) ;
		System.out.println("sum_left + sum_right: " + (fmcs.sum_left + fmcs.sum_right)) ;
	}
}