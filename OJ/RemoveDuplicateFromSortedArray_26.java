/*
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 */
public class RemoveDuplicateFromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        if(0 == nums.length || null == nums)
            return 0;
        int min = nums[0];
        int len = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > min){
                min = nums[i];
                len++;
                if(i != (len - 1)){
                    int tmp = nums[len - 1];
                    nums[len - 1] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
        return len;
    }

    public static void main(String args[]){
        //int[] nums = {1, 1, 2, 2, 3, 4, 4, 4, 5, 6, 6, 6, 7, 8, 9};
        int[] nums = {-3, -1, -1, 0, 0, 0, 0, 0, 2};
        System.out.println(new RemoveDuplicateFromSortedArray_26().removeDuplicates(nums));
        for(int i : nums)
            System.out.print(i + ", ");
    }
}
