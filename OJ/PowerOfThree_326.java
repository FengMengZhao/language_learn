public class PowerOfThree_326{
    public boolean isPowerOfThree(int n){
        int tmp = n;
        int count = 0;
        while(tmp > 1){
            tmp /= 3;
            count++;
        }

        return n == (int)Math.pow(3, count);
    }

    public static void main(String args[]){
        for(int i = 0; i < 10; i++){
            System.out.println(i + " --> " + new PowerOfThree_326().isPowerOfTwo(i));
        }
    }
}
