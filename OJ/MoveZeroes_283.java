public class MoveZeroes_283{
    public void moveZeroes(int[] nums){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == 0 && nums[j] != 0){
                    swap(nums, i, j);
                    break;
                }
            }
        }
    }

    public static void swap(int[] nums, int one, int another){
        int tmp = nums[one];
        nums[one] = nums[another];
        nums[another] = tmp;
    }

    public static void main(String args[]){
        int[] nums = {3, 0, 3, 3, 3};
        new MoveZeroes_283().moveZeroes(nums);
        for(int i : nums)
            System.out.print(i + ", ");
    }
}

