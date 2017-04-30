/*
 * An object is an wrapper of state(field) and behavior(method)
 * The behavior change the state of the object, and the state keep track of the object itself
 * According to many invoking of the object's methods, we can capture the useful state of the object
 * Sometimes, we just look the state of the object is the object, because we only have interest of the state
 * Keep in mind, the stata is the only thing we really have interest in
 * You must understand what the object really is
 */
import java.util.*;

public class WeiDianCoverLineLength{
    private int line_length = 0;

    public int getLength(){
        return line_length;
    }
     
    public int coverLength(Integer[]... integer_arr){
        List<Integer[]> ls = sortArr(integer_arr);
        Iterator<Integer[]> iter = ls.iterator();
        Integer[] next = null;
        int start, end = 0;
        while(iter.hasNext()){
            next = iter.next();
            start = next[0] > end ? next[0] : end;
            end = next[next.length - 1] > end ? next[next.length - 1] : end;
            line_length += (end - start);
        }
        return line_length;
    }

    public static List<Integer[]> sortArr(Integer[]... integer_arr){
        //List<Integer[]> ls = new ArrayList<>(Arrays.asList(integer_arr));
        List<Integer[]> ls = new ArrayList<>();
        Collections.addAll(ls, integer_arr);
        Collections.sort(ls, new Comparator<Integer[]>(){
            public int compare(Integer[] one, Integer[] another){
                return one[0].compareTo(another[0]) == 0
                    ? one[one.length - 1].compareTo(another[another.length - 1])
                    : one[0].compareTo(another[0]);
            }
        });
        return ls;
    }

    public static void main(String... args){
        int res  = new WeiDianCoverLineLength().coverLength(new Integer[]{1, 3}, 
                                                            new Integer[]{8, 10},
                                                            new Integer[]{2, 6},
                                                            new Integer[]{15, 18},
                                                            new Integer[]{16, 18});
        System.out.println(res);
    }
}
