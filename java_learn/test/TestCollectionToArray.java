import java.util.*;

public class TestCollectionToArray{
    public static void main(String args[]){
        List<String> ls = new ArrayList<String>(Arrays.asList("fmzcllfslflszjb".split("")));
        String[] str_arr = ls.toArray(new String[0]);
        for(String str : str_arr)
            System.out.print(str + "\t");
    }
}
