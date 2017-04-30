import java.util.*;

public class NumberThreeExit{
    public int numberThreeExit(int n){
        List<Integer> ls = new LinkedList<>();
        for(int i = 1; i <= n; i++)
            ls.add(i);
        int size,
            start = 2;
        while(ls.size() > 1){
            size = ls.size();
            while(start < size){
                ls.set(start, null);
                start += 3;
            }
            start -= size;
            ls.removeAll(Collections.singleton(null));
        }
        return ls.get(0);
    }

    public static void main(String args[]){
        System.out.println(new NumberThreeExit().numberThreeExit(8));
    }
}
