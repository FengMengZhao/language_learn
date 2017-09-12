public class TestSwapWithoutTmp{

    public static void main(String args[]) {
        int a = 2;
        int b = 3;
        /*
        a = a - b;
        b = a + b;
        a = b - a;
        */
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.printf("a : %d, b : %d\n", a, b);
    }
}
