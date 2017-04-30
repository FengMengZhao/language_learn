public class PowerOfTwo_231{
    public boolean isPowerOfTwo(int n){
        int tmp =0;
        int count = 0;
        while(tmp > 1){
            tmp /= 2;
            count++;
        }
        return n == (int)Math.pow(2, tmp);
    }
}
