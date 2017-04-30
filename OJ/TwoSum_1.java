import java.util.Arrays;
import java.util.stream.IntStream;


public class TwoSum_1 {
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
