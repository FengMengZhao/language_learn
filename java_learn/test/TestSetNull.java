import java.util.*;

public class TestSetNull{
    public static void main(String args[]){
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        System.out.println(set.add(null));
        System.out.println(set.add(null));
        System.out.println(set.size());
    }
}
