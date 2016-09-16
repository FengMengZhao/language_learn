import java.util.*;

public class HappyNumber_202{
    Set<Integer> set = new HashSet<>();
    public boolean isHappy(int n){
        if(n == 1)
            return true;
        if(! set.add(n))
            return false;

        String n_str = Integer.toString(n);
        int tmp = 0;
        for(char c : n_str.toCharArray())
            tmp += (int)Math.pow((c - '0'), 2);
        n = tmp;

        return isHappy(n);
    }

    public static void main(String args[]){
        System.out.println(new HappyNumber_202().isHappy(20));
    }
}
