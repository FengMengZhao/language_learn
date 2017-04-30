import java.util.*;

public class QunaerNextSym{
    public static boolean isSymmetric (long number) {
        if (number == 0) return true;
        else if (number < 0) return false;
        long DEG_10 = (long)(Math.pow(10, (int)Math.log10(number)));

        while (number > 0){
            long dStart = number / DEG_10;
            long dEnd = number % 10;
            if (dStart != dEnd) return false;
            number = (number - dStart * DEG_10 - dEnd) / 10;
            DEG_10 /= 100;

        }

        return true;

    }

    public long nextNum(int num){
        do{
            num++;
        }while(!isSymmetric(num));

        return num;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int num = s.nextInt();
            System.out.println(new QunaerNextSym().nextNum(num));
        }
    }
}
