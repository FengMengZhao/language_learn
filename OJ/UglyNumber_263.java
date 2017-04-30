public class UglyNumber_263{
    public boolean isUgly(int num){
        if(num <= 0) return false;
        while((num % 2) == 0)
            num >>= 1;
        
        while((num % 3) == 0)
            num /= 3;

        while((num % 5) == 0)
            num /= 5;
        return num == 1;
    }

    public static void main(String args[]){
        System.out.println(new UglyNumber_263().isUgly(6));
        System.out.println(new UglyNumber_263().isUgly(8));
        System.out.println(new UglyNumber_263().isUgly(11));
    }
}

