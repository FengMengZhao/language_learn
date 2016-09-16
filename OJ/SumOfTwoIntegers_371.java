public class SumOfTwoIntegers_371{
    public int getSum(int a, int b){
        a += b;
        return a;
    }

    public static void main(String args[]){
        System.out.println(new SumOfTwoIntegers_371().getSum(10, -1));
    }
}
