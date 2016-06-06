package org.fmz.algorithm ;

class DividedArray{
	int max_left ;
	int max_right ;
	int sum ;
}

public class FindMaximumSubarray3{
	private int max_low ;
	private int max_high ;
	private int total ;
	private FindMaxCrossingSubarray fmcs = null ;
	private DividedArray left = null ;
	private DividedArray right = null ;

	public FindMaximumSubarray3(FindMaxCrossingSubarray fmcs){
		this.fmcs = fmcs ;
	}

	public DividedArray findMaxiumSubarray(Integer[] array, int low , int high){
		if(low == high){
			max_low = low ;
			max_high = high ;
			total = array[low] ;
		}else{
			int middle = (low + high) / 2 ;
			left = findMaxiumSubarray(array, low, middle-1) ;
			right = findMaxiumSubarray(array, middle, high) ;
			fmcs.findMaxCrossingSubarray(array, low, middle, high) ;
			if(left.sum >= right.sum && left.sum >= (fmcs.sum_left + fmcs.sum_right)){
				max_low = left.max_left ;
				max_high = left.max_right ;
				total = left.sum ;
			}else if(right.sum >= left.sum && right.sum >= (fmcs.sum_left + fmcs.sum_right)){
				max_low = right.max_left ;
				max_high = right.max_right ;
				total = right.sum ;
			}else{
				max_low = fmcs.max_left ;
				max_high = fmcs.max_right ;
				total = fmcs.sum_left + fmcs.sum_right ;
			}
		}
		return left ;
	}

	public String toString(){
		return "max_low: " + max_low + ", max_high: " + max_high + ", total: " + total ;
	}
}