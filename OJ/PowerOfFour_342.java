public class PowerOfFour_342{
    public boolean isPowerOfFour(int num){
        if(num < 1)
            return false;
        int tmp = num;
        int count = 0;
        while(tmp > 1){
            tmp /= 4;
            count++;
        }
        return num == (int)Math.pow(4, count);
    }
    public static void main(String args[]){
        System.out.println(new PowerOfFour_342().isPowerOfFour(64));
        System.out.println(new PowerOfFour_342().isPowerOfFour(15));
    }
}
