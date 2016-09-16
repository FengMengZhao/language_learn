import java.util.*;
import java.util.stream.*;

public class IntersectionTwoArr_349{
    public int[] intersection(int[] nums1, int[] nums2){
        Integer[] nums1_I = IntStream.of(nums1).boxed().toArray(Integer[]::new);
        Integer[] nums2_I = IntStream.of(nums2).boxed().toArray(Integer[]::new);

        Set<Integer> nums1_set = new HashSet<>(Arrays.asList(nums1_I));
        Set<Integer> nums2_set = new HashSet<>(Arrays.asList(nums2_I));
        nums1_set.retainAll(nums2_set);
        int[] res = new int[nums1_set.size()];
        int i = 0;
        for(Integer I : nums1_set)
            res[i++] = I;
        return res;
    }

    public static void main(String args[]){
        int[] res = new IntersectionTwoArr_349().intersection(new int[]{1, 2, 2, 3, 4},
                                                              new int[]{2 ,2, 3, 4});
        for(int i : res)
            System.out.print(i + ", ");
    }
}

