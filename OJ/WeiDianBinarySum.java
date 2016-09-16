public class WeiDianBinarySum{
    public String binarySum(String one, String another){
        int a = Integer.parseInt(one, 2);
        //System.out.println(a);
        int b = Integer.parseInt(another, 2);
        //System.out.println(b);

        int c = a + b;

        return Integer.toString(c, 2);
    }

    public static void main(String args[]){
        System.out.println(new WeiDianBinarySum().binarySum("1110" ,"10"));
    }
}
