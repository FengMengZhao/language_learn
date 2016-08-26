import java.util.*;

public class TestArraysAsList{
    public static void main(String args[]){
        String[] str_arr = {"fmz", "cll", "wlm", "fsl"};
        List<String> ls = Arrays.asList(str_arr);
        System.out.println(ls);
        ls.set(1, "fmz1");
        System.out.println(ls);
        str_arr[3] = "fsl2";
        System.out.println(ls);
    }
}
