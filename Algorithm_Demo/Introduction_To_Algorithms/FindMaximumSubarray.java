package org.fmz.algorithm ;

public class FindMaximumSubarray{
	private FindMaxCrossingSubarray fmcs = new FindMaxCrossingSubarray() ;
	public FindMaxCrossingSubarray findMaxiumSubarray(Integer[] array, int low , int high){
		if(low < high){
			int middle = (low + high) / 2 ;
			findMaxiumSubarray(array, low, middle-1) ;
			findMaxiumSubarray(array, middle, high) ;
			fmcs.findMaxCrossingSubarray(array, low, middle, high) ;
		}
		return this.fmcs ;
	}
}