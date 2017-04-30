/*
 * 1, 2, 3, ..., n lamb is off 
 * the first student turn on one all the lamb 
 * the second student turn on or turn off lamb (2, 4, ..., 2k)
 * the third student turn on or turn off lamb (3, 6, ..., 3k)
 * ...
 * After k student operation, which lambs is on
 */
import java.util.*;
public class TCLOnOffLamb{
    public int[] onOff(int n, int k){
        boolean[] lamb_on = new boolean[n];
        int count = 1;
        while(count <= n){
            for(int i = 0; i <k; i++){
                if(count % (i+1) == 0)
                    lamb_on[count - 1] = ! lamb_on[count - 1];
            }
            count++;
        }
        List<Integer> ls = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(lamb_on[i] == true)
                ls.add(i + 1);

        }

        int[] res = new int[ls.size()];
        int i = 0;
        for(Integer I : ls)
            res[i++] = I;
        return res;
    }

    public static void main(String args[]){
        int[] res = new TCLOnOffLamb().onOff(100, 100);
        for(int i : res){
            System.out.print(i + ", ");
        }
    }
}
