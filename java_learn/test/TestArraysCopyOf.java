import java.util.*;

public class TestArraysCopyOf{
    public static void main(String args[]){
        int[] num = {1, 2, 3, 4, 5};
        int[] new_num = new int[num.length - 1];
        System.arraycopy(num, 2, new_num, 0, new_num.length - 1);
        for(int i : new_num)
            System.out.print(i + ", ");
    }
}
