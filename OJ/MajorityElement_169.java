import java.util.*;
//import java.util.stream.*;

public class MajorityElement_169{
    public int majorityElement(int[] nums){
        //Integer[] nums_I = IntStream.of(nums).boxed().toArray(Integer[]::new);
        Map<Integer, Integer> count_map = new HashMap<>();
        for(int i : nums){
            Integer freq = count_map.get(i);
            count_map.put(i, freq ==  null ? 0 : freq + 1);
        }
        for(Map.Entry<Integer, Integer> entry : count_map.entrySet()){
            if(entry.getValue() >= (nums.length >> 1))
                return entry.getKey();
        }
        return -1;
    }

    public static void main(String args[]){
        System.out.println(new MajorityElement_169().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
