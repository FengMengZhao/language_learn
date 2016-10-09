import java.util.*;

public class PascalTriangle_118{
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> res = new ArrayList<>();
        if(numRows > 0){
            Collections.addAll(res, Arrays.asList(1));
            while(numRows > 1){
                List<Integer> tmp = res.get(res.size() - 1);
                List<Integer> new_ls = new ArrayList<>();
                new_ls.add(1);
                for(int i = 0; i < tmp.size() - 1; i++){
                    List<Integer> sub_tmp = tmp.subList(i, i+2);
                    int sum = 0;
                    for(Integer I : sub_tmp)
                        sum += I;
                    new_ls.add(sum);
                }
                new_ls.add(1);
                res.add(new_ls);
                numRows--;
            }
        }
        return res;
    }

    public static void main(String args[]){
        System.out.println(new PascalTriangle_118().generate(8));
    }
}
