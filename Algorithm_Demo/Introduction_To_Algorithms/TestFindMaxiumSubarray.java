package org.fmz.algorithm ;

import java.io.* ;

import java.util.* ;

public class TestFindMaxiumSubarray{
	public static void main(String args[]){
		/*
		Random random = new Random(25) ;
		Integer[] stock = new Integer[19] ;
		for(int i=0;i<stock.length;i++){
			stock[i] = random.nextInt(100) ;
		}
		System.out.println(Arrays.asList(stock)) ;
		Integer[] stockDifferToPrevious = new Integer[stock.length-1] ;
		for(int j=0;j<stockDifferToPrevious.length;j++){
			stockDifferToPrevious[j] = stock[j+1] - stock[j] ;
		}
		System.out.println(Arrays.asList(stockDifferToPrevious)) ;
		*/
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
		System.out.println("********************************************") ;
		FindMaximumSubarray fms = new FindMaximumSubarray() ;
		fmcs = fms.findMaxiumSubarray(stockDifferToPrevious, low, high) ;
		System.out.println("max_left: " + fmcs.max_left) ;
		System.out.println("max_right: " + fmcs.max_right) ;
		System.out.println("sum_left: " + fmcs.sum_left) ;
		System.out.println("sum_right: " + fmcs.sum_right) ;
		System.out.println("sum_left + sum_right: " + (fmcs.sum_left + fmcs.sum_right)) ;
	}
}