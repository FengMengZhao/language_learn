import java.util.*;

public class FindDups{
    public static void main(String args[]){
        Set<String> ls = new HashSet<>();
        for(String str : args)
            ls.add(str);
        System.out.print(ls);
    }
}
