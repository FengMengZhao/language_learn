package org.fmz.algorithm ;//当一个return语句需要返回多个值的时候，就需要用容器来进行保存

import java.util.* ;

public class FindMaximumSubarray4{
	public static List<Integer> findCrossingSubarray(Integer[] array, int low, int middle, int high){
		List<Integer> list = new ArrayList<Integer>() ;
		int sum_left = Integer.MIN_VALUE / 10 ;//对于Integer.MIN_VALUE - 1 则转化为 Integer.MAX_VALUE，所以应用的时候要小心
		int sum = 0 ;
		int max_left = 0 ;
		for(int i=middle-1;i>=0;i--){
			sum += array[i] ;
			if(sum > sum_left){
				sum_left = sum ;
				max_left = i ;
			}
		}
		list.add(max_left) ;
		int sum_right = Integer.MIN_VALUE / 10 ;
		sum = 0 ;
		int max_right = 0 ;
		for(int j=middle;j<=high;j++){
			sum += array[j] ;
			if(sum >sum_right){
				sum_right = sum ;
				max_right = j ;
			}
		}
		list.add(max_right) ;
		list.add(sum_left + sum_right) ;
		return list ;
	}
	public static List<Integer> findMaxSubarray(Integer[] array, int low, int high){
		List<Integer> list = new ArrayList<Integer>() ;
		if(low == high){
			list.add(low) ;
			list.add(high) ;
			list.add(array[low]) ;
			return list ;
		}else{
			int middle = (low + high) / 2 ;
			List<Integer> left = findMaxSubarray(array, low, middle) ;
			List<Integer> right = findMaxSubarray(array, middle+1, high) ;
			List<Integer> cross = findCrossingSubarray(array, low, middle, high) ;
			int left_sum = left.get(left.size() - 1) ;
			int right_sum = right.get(right.size() - 1) ;
			int cross_sum = cross.get(cross.size() - 1) ;
			if(left_sum >= right_sum && left_sum >= cross_sum){
				return left ;
			}else if(right_sum >= left_sum && right_sum >= cross_sum){
				return right ;
			}else{
				return cross ;
			}
		}
	}
	public static void main(String args[]){
		Random random = new Random(25) ;
		Integer[] stock = new Integer[13] ;
		for(int i=0;i<stock.length;i++){
			stock[i] = random.nextInt(100) ;
		}
		System.out.println(Arrays.asList(stock)) ;
		Integer[] stockDifferToPrevious = new Integer[stock.length-1] ;
		for(int j=0;j<stockDifferToPrevious.length;j++){
			stockDifferToPrevious[j] = stock[j+1] - stock[j] ;
		}
		System.out.println(Arrays.asList(stockDifferToPrevious)) ;
		int low = 0 ;
		int high = stockDifferToPrevious.length-1 ;
		int middle = stockDifferToPrevious.length / 2 ;
		List<Integer> list = findMaxSubarray(stockDifferToPrevious, low, high) ;
		System.out.println(list) ;
	}
}