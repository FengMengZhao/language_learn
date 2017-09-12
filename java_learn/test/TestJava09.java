public class TestJava09{
    public static void main(String args[]){
        int n = 40;
        for(int i = 1; i <=n; i++){
            for(int j = n; j > i; j--)
                System.out.print(" ");
            for(int k = 0; k < i; k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
