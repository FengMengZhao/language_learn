import java.util.*;

public class IntersectionTwoArr_350_Elegant{
    public int[] intersect(int[] nums1, int[] nums2){
        Map<Integer, Integer> map_count = new HashMap<>();
        List<Integer> res_ls = new ArrayList<>();

        for(int i : nums1){
            Integer freq = map_count.get(i);
            map_count.put(i, freq == null ? 0 : freq + 1);
        }

        for(int i : nums2){
            Integer freq = map_count.get(i);
            if(freq >= 0){
                map_count.put(i, freq - 1);
                res_ls.add(i);
            }
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
        int[] res = new IntersectionTwoArr_350_Elegant().intersect(nums1, nums2);
        for(int i : res)
            System.out.print(i + ", ");
    }
}
