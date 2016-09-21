import java.util.*;

public class SumSquare{
    public double sum(int n, int m){
        double[] tmp = new double[m];
        tmp[0] = n;
        if(m > 1){
            for(int i = 1; i < m; i++)
                tmp[i] = Math.pow(tmp[i - 1], 0.5);
        }

        double res = 0;
        for(double d : tmp)
            res += d;
        return res;
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        SumSquare main = new SumSquare();
        while(s.hasNextInt()){
            int n = s.nextInt();
            int m = s.nextInt();
            System.out.printf("%.2f\n", main.sum(n, m));
        }
        s.close();
    }
}

