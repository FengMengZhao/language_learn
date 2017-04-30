import java.util.*;
import java.util.stream.*;

public class IntersectionTwoArr_350{
    public int[] intersect(int[] nums1, int[] nums2){
        Integer[] nums1_I = IntStream.of(nums1).boxed().toArray(Integer[]::new);
        Integer[] nums2_I = IntStream.of(nums2).boxed().toArray(Integer[]::new);
        Map<Integer, Integer> map_count1 = new HashMap<>();
        Map<Integer, Integer> map_count2 = new HashMap<>();
        for(Integer I : nums1_I){
            Integer freq = map_count1.get(I);
            map_count1.put(I, freq == null ? 0 : freq + 1);
        }
        for(Integer I : nums2_I){
            Integer freq = map_count2.get(I);
            map_count2.put(I, freq == null ? 0 : freq + 1);
        }

        Set<Integer> nums1_set = new HashSet<>(Arrays.asList(nums1_I));
        Set<Integer> nums2_set = new HashSet<>(Arrays.asList(nums2_I));
        nums1_set.retainAll(nums2_set);

        List<Integer> res_ls = new ArrayList<>();
        for(Integer I : nums1_set){
            int tmp1 = map_count1.get(I);
            int tmp2 = map_count2.get(I);
            int num = tmp1 < tmp2 ? tmp1 : tmp2;
            while(num-- >=0)
                res_ls.add(I);
        }

        int[] res = new int[res_ls.size()];
        int i = 0;
        for(Integer I : res_ls)
            res[i++] = I;
        return res;
    }

    public static void main(String args[]){
        int[] nums1 = {3, 2, 2, 3};
        int[] nums2 = {3, 2, 3, 3};
        int[] res = new IntersectionTwoArr_350().intersect(nums1, nums2);
        for(int i : res)
            System.out.print(i + ", ");
    }
}
