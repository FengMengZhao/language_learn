import java.util.*;

public class PascalTriangleII_119{
    public List<Integer> getRow(int rowIndex){
        int numRows = rowIndex + 1;
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
        return res.get(rowIndex);
    }

    public static void main(String args[]){
        System.out.println(new PascalTriangleII_119().getRow(1));
        System.out.println(new PascalTriangleII_119().getRow(2));
        System.out.println(new PascalTriangleII_119().getRow(3));
        System.out.println(new PascalTriangleII_119().getRow(4));
    }
}
