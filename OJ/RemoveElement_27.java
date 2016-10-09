/*
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
 */
public class RemoveElement_27 {
    public int removeElement(int[] nums, int val) {
        int left = 0, 
            right = nums.length - 1;
        while(left <= right){
            while(nums[left] != val){
                left++;
                if(left >= nums.length)
                    return nums.length;
            }
            while(nums[right] == val){
                right--;
                if(right < 0)
                    return 0;
            }
            if(left < right){
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
        }
		return left;
    }

    public static void main(String args[]){
        int[] nums = {2, 3, 3, 2, 2};
        System.out.println(new RemoveElement_27().removeElement(nums, 3));
        for(int i : nums)
            System.out.print(i + ", ");
    }
}
