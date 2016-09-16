import java.util.*;

public class WeiDianSwapElement{
    public static List<Integer> swapElement(List<Integer> ls){
        List<Integer> new_ls = new LinkedList(ls);
        int count = new_ls.size();
        for(int i = 0; i < count; i++){
            if(i % 2 == 1){
                Integer c = new_ls.remove(i);
                new_ls.add(i - 1, c);
            }
        }
        return new_ls;
    }
    
    public static void main(String args[]){
        List<Integer> ls = new LinkedList<>();
        Collections.addAll(ls, 1, 2, 3 ,4, 5, 6);
        System.out.println("Before: " + ls);
        ls = swapElement(ls);
        System.out.println("After: " + ls);
    }
}
