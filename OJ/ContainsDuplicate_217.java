import java.util.*;
import java.util.stream.*;

public class ContainsDuplicate_217{
    public boolean containsDuplicate(int[] nums){
        
        return nums.length == 0
                               ? false 
                               : new HashSet<Integer>(Arrays.asList(IntStream.of(nums).boxed().toArray(Integer[]::new))).size() == nums.length;
    }

    public static void main(String args[]){
        System.out.println(new ContainsDuplicate_217().containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(new ContainsDuplicate_217().containsDuplicate(new int[]{}));
        System.out.println(new ContainsDuplicate_217().containsDuplicate(new int[]{1, 2, 3, 4, 2}));
    }
}
