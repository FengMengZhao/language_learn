package org.fmz.algorithm ;

public class FindMaxSubArrayReturnMaxValue{
	public static int findCrossingSubarray(Integer[] array, int low, int middle, int high){
		int sum_left = Integer.MIN_VALUE / 10 ;//对于Integer.MIN_VALUE - 1 则转化为 Integer.MAX_VALUE，所以应用的时候要小心
		int sum = 0 ;
		for(int i=middle-1;i>=0;i--){
			sum += array[i] ;
			if(sum > sum_left){
				sum_left = sum ;
			}
		}
		int sum_right = Integer.MIN_VALUE / 10 ;
		sum = 0 ;
		for(int j=middle;j<=high;j++){
			sum += array[j] ;
			if(sum >sum_right){
				sum_right = sum ;
			}
		}
		return sum_left + sum_right ;
	}

	public static int findMaxSubarray(Integer[] array, int low, int high){
		if(low == high){
			return array[low] ;
		}else{
			int middle = (low + high) / 2 ;
			int left = findMaxSubarray(array, low, middle) ;
			int right = findMaxSubarray(array, middle+1, high) ;
			int cross = findCrossingSubarray(array, low, middle, high) ;
			return Math.max(Math.max(left, right), cross) ;
		}
	}

	public static void main(String args[]){
		Integer[] stockDifferToPrevious = {13, -3, -25, -20, -3, -16, -23, -18, 20, -7, 112, -5, -22, -15, -4, 117} ;
		int low = 0 ;
		int high = stockDifferToPrevious.length-1 ;
		int middle = stockDifferToPrevious.length / 2 ;
		System.out.println(findCrossingSubarray(stockDifferToPrevious, low, middle, high)) ;
		System.out.println(findMaxSubarray(stockDifferToPrevious, low, high)) ;
	}
}