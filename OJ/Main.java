import java.util.*;

public class Main{
    public static int maxInArr(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    public int findMin(int[] arr, int len){
        int sum = 0;
        for(int i = 0; i < len; i++)
            sum += arr[i];
        int desc = len;
        int max_in_arr = maxInArr(arr);
        int div = 0;
        while(desc > 0){
            div = sum / desc;
            if(sum % desc == 0 && div >= max_in_arr)
                break;
            desc --;
        }
        return div;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Main main = new Main();
        while(s.hasNext()){
            int len = s.nextInt();
            if(len == 0)
                break;
            int[] arr = new int[len];
            for(int i = 0; i < len; i++)
                arr[i] = s.nextInt();
            System.out.println(main.findMin(arr, len));
        }
    }
}
