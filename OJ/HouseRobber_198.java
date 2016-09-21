public class HouseRobber_198{
    public int rob_recur(int[] nums){
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return nums[0] > nums[1] ? nums[0] : nums[1];

        int[] mercy_cur = new int[nums.length - 1];
        int[] rob_cur = new int[nums.length - 2];
        System.arraycopy(nums, 1, mercy_cur, 0, mercy_cur.length);
        System.arraycopy(nums, 2, rob_cur, 0, rob_cur.length);
        return Math.max(rob_recur(mercy_cur), nums[0] + rob_recur(rob_cur));
    }

    public int rob(int[] nums){
        if(null == nums || 0 == nums.length)  
            return 0;
        if(1 == nums.length)
            return nums[0];
        for(int i = 1; i < nums.length; i++){
            if(i == 1)
                nums[1] = nums[0] > nums[1] ? nums[0] : nums[1];
            else
                nums[i] = Math.max(nums[i - 1], nums[i] + nums[i - 2]);
        } 
        return nums[nums.length - 1];
    }

    private int rob_tail(int yes, int t, int[] nums, int index){
        if(index >= nums.length)
            return t;
        return rob_tail(t, Math.max(yes + nums[index], t), nums, index++);
    }

    public int rob_tail_recur(int[] nums){
        if(nums.length == 0)
            return 0;
        if(nums.length == 1)
            return nums[0];
        if(nums.length == 2)
            return nums[0] > nums[1] ? nums[0] : nums[1];
        return rob_tail(nums[0],
                        Math.max(nums[0], nums[1]),
                        nums[index], 2);
    }

    public static void main(String args[]){
        int[] nums = {183,219,57,193,94,233,202,154,65,240,97,234,100,249,186,66,90,238,168,128,177,235,50,81,185,165,217,207,88,80,112,78,135,62,228,247,211};
        int[] nums2 = {2, 1, 1, 2};
        //System.out.println(new HouseRobber_198().rob_recur(nums));
        System.out.println(new HouseRobber_198().rob(nums));
        //System.out.println(new HouseRobber_198().rob_recur(nums2));
        System.out.println(new HouseRobber_198().rob(nums2));
    }
}
