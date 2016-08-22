import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
	// 344. Reverse String
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    
    
	// 162. Find Peak Element
	public int findPeakElement(int[] nums) {
		if(nums.length == 1 || nums[0] > nums[1])
			return 0;
		if(nums[nums.length-1] > nums[nums.length-2])
			return nums.length-1;
		
        int i = 0;
        while(i < nums.length-2 && ! (nums[i] < nums[i+1] && nums[i+2] < nums[i+1] ))
        	i++;
        return i+1;
    }
	
	public int[] convertStrArrToIntArr(String[] str_arr){
		int[] int_arr = new int[str_arr.length];
		for(int i=0; i<int_arr.length; i++){
			int_arr[i] = Integer.parseInt(str_arr[i]);
		}
		return int_arr;
	}
	
	// 8. String to Integer
	public int myAtoi(String str) {
		/*
        if(str.equals("") || str.equals("+") || str.equals("-"))
            return 0;
        return Integer.parseInt(str);
        */
        int index = 0, sign = 1, total = 0;
        //Empty string
        if(str.length() == 0) return 0;

        //Remove Spaces
        while(index < str.length() && str.charAt(index) == ' ')
            index ++;

        //Handle signs
        if(index < str.length()){
	        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
	            sign = str.charAt(index) == '+' ? 1 : -1;
	            index ++;
	        }
        }else
        	return 0;
        
        //Convert number and avoid overflow
        while(index < str.length()){
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;

            //check if total will be overflow after 10 times and add digit
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = 10 * total + digit;
            index ++;
        }
        return total * sign;
    }
	
	// 1. Two Sum
	public int[] twoSum(int[] nums, int target) {
		int[] indices = new int[2];
		Integer[] Nums = IntStream.of(nums).boxed().toArray(Integer[]::new);
		nums = null;
		int another;
        for(int i=0; i<Nums.length; i++){
        	another = target - Nums[i];
        	int index = Arrays.asList(Nums).indexOf(another);
        	if(index != -1 && index !=i){
        		indices[0] = i;
        		indices[1] = index;
        		break;
        	}
        }
		return indices;
    }
}