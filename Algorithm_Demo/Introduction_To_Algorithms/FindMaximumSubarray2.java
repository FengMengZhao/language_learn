package org.fmz.algorithm ;

class CrossingSubarray{
	int cross_low ;
	int cross_high ;
	int sum_left = Integer.MIN_VALUE ;
	int sum_right = Integer.MIN_VALUE ;
}

public class FindMaximumSubarray2{
	private int max_low ;
	private int max_high ;
	private int total ;
	private CrossingSubarray cs = null ;
	public FindMaximumSubarray2(CrossingSubarray cs){
		this.cs = cs ;
	}

	public CrossingSubarray findMaxCrossingSubarray(Integer[] array, int low, int middle, int high){
		int sum = 0 ;
		for(int i=middle-1;i>=0;i--){
			sum += array[i] ;
			if(sum > cs.sum_left){
				cs.sum_left = sum ;
				cs.cross_low = i ;
			}
		}
		sum = 0 ;
		for(int j=middle;j<=high;j++){
			sum += array[j] ;
			if(sum >cs.sum_right){
				cs.sum_right = sum ;
				cs.cross_high = j ;
			}
		}
		return cs ;
	}

	public FindMaximumSubarray2 findMaxiumSubarray(Integer[] array, int low , int high){
		FindMaximumSubarray2 left = null ;
		FindMaximumSubarray2 right = null ;
		if(low == high){
			max_low = low ;
			max_high = high ;
			total = array[low] ;
		}else{
			int middle = (low + high) / 2 ;
			left = findMaxiumSubarray(array, low, middle-1) ;
			right = findMaxiumSubarray(array, middle, high) ;
			cs = findMaxCrossingSubarray(array, low, middle, high) ;
			if(left.total >= right.total && left.total >= (cs.sum_left + cs.sum_right)){
				max_low = left.max_low ;
				max_high = left.max_high ;
				total = left.total ;
			}else if(right.total >= left.total && right.total >= (cs.sum_left + cs.sum_right)){
				max_low = right.max_low ;
				max_high = right.max_high ;
				total = right.total ;
			}else{
				max_low = cs.cross_low ;
				max_high = cs.cross_high ;
				total = cs.sum_left + cs.sum_right ;
			}
		}
		return left ;
	}

	public String toString(){
		return "max_low: " + max_low + ", max_high: " + max_high + ", total: " + total ;
	}
}