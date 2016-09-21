import java.util.*;

public class Flower{
    public List<Integer> isFlower(int m, int n){
        List<Integer> ls = new ArrayList<>();
        for(int i = m; i <= n; i++){
            int res = 0;
            for(char c : ("" + i).toCharArray())
                res += (int)Math.pow((c - '0'), 3);
            if(res == i)
                Collections.addAll(ls, i);
        }
        return ls;
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()){
            int m = s.nextInt();
            int n = s.nextInt();
            List<Integer> ls = new ArrayList<>(new Flower().isFlower(m, n));
            if(ls.size() == 0)
                System.out.println("no");
            else{
                for(Integer I : ls)
                    System.out.print(I + " ");
                System.out.println();
            }
        }
    }
}
