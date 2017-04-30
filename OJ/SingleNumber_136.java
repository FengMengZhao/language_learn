import java.util.stream.*;
import java.util.*;

public class SingleNumber_136{
    public int singleNumber(int[] nums){
        Integer[] nums_I = IntStream.of(nums).boxed().toArray(Integer[]::new);
        Map<Integer, Integer> map = new HashMap<>();
        Iterator<Integer> iter = Arrays.asList(nums_I).iterator();
        Integer freq = null;
        Integer next = null;
        while(iter.hasNext()){
            next = iter.next();
            map.put(next, freq = map.get(next) == null ? 1 : freq + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1)
                return entry.getKey();
        }
        return -1;
    }

    public static void main(String args[]){
        System.out.println(new SingleNumber_136().singleNumber(new int[]{1, 2, 4, 4, 8, 1, 8}));

    }
}

