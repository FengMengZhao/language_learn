public class TestJava{
    public static void main(String args[]){
        int x = 1;
        int y = 2;
        int z = 3;
        int max = 0;
        /*
        int tmp = x > y ? x : y;
        max = tmp > z ? tmp : z;
        */

        if(x > y) max = x;
        else max = y;
        if(z > max) max = z;
        System.out.println("最大值为：" + max);
    }
}
