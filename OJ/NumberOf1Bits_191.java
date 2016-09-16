public class NumberOf1Bits_191{
    public int hammingWeight(int n){
        int res = 0;
        while(n  > 0){
            res += (n & 1);
            n >>> 1;
        }
        return res;
    }

    public static void main(String args[]){
        System.out.println(new NumberOf1Bits_191().hammingWeight(2147483648));
    }
}
