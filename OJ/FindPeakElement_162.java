
public class FindPeakElement_162 {
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
}
