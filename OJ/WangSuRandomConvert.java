import java.util.*;

public class WangSuRandomConvert{
    private static Random rnd = new Random(26);
    public int rand_7(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 
                     1, 2, 3, 4, 5, 6, 7,
                     1, 2, 3, 4, 5, 6, 7,};
        return arr[rnd.nextInt(5) + rnd.nextInt(5) + rnd.nextInt(5) + rnd.nextInt(5) + rnd.nextInt(5)];
    }
    public static void main(String args[]){
        WangSuRandomConvert w = new WangSuRandomConvert();
        int[] count = new int[7];
        for(int i = 0; i < 70000; i++)
            count[w.rand_7() - 1]++;
        for(int i : count)
            System.out.println(i);
    }
}
