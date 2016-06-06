package org.fmz.algorithm ;

public class TestFindMaxiumSubarray2{
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
		int low = 0 ;
		int high = stockDifferToPrevious.length-1 ;
		FindMaximumSubarray2 fms = new FindMaximumSubarray2(new CrossingSubarray()) ;
		fms.findMaxiumSubarray(stockDifferToPrevious, low, high) ;
		System.out.println(fms) ;
	}
}