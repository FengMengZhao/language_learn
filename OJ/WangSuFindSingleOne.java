public class WangSuFindSingleOne{
    public int findSingleOne(int[] arr){
        int sum = 0;
        for(int i : arr)
            sum ^= i;// any number XOR 0 equal itself(i ^ 0 = i), same xor same equal 0(i ^ i = 0 )
        return sum;
    }

    public static void main(String args[]){
        System.out.println(new WangSuFindSingleOne().findSingleOne(new int[]{1, 2, 2, 3, 4, 1, 4, 5, 7, 7, 3}));
    }
}
