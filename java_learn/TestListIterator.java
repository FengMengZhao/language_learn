import java.util.*;

public class TestListIterator{
    public static void main(String args[]){
        List<Integer> ls = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 3, 4}));
        ListIterator<Integer> iter = ls.listIterator(ls.size());
        while(iter.hasPrevious())
            System.out.print(iter.previous() + ", ");
    }
}
