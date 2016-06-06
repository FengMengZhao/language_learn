package org.fmz.algorithm ;

public class FindMaxCrossingSubarray{
	int max_left ;
	int max_right ;
	int sum_left = Integer.MIN_VALUE ;
	int sum_right = Integer.MIN_VALUE ;

	public void findMaxCrossingSubarray(Integer[] array, int low, int middle, int high){
		int sum = 0 ;
		for(int i=middle-1;i>=0;i--){
			sum += array[i] ;
			if(sum > sum_left){
				sum_left = sum ;
				max_left = i ;
			}
		}
		sum = 0 ;
		for(int j=middle;j<=high;j++){
			sum += array[j] ;
			if(sum >sum_right){
				sum_right = sum ;
				max_right = j ;
			}
		}
	}
}