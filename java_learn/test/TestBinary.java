public class TestBinary{
    public static void main(String args[]){
        /*
        System.out.println(Integer.parseUnsignedInt("111", 2));
        System.out.println(Integer.parseInt("111", 2));
        System.out.println(Integer.parseUnsignedInt("11111111111111", 2));
        System.out.println(Integer.parseInt("11111111111111", 2));
        System.out.println(Integer.parseUnsignedInt("10111111111111111111111111111111", 2));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toString(Integer.MAX_VALUE));
        */

        System.out.println(Integer.parseUnsignedInt("11111111111111111111111111111101", 2));
        //System.out.println(Integer.parseInt("11111111111111111111111111111101", 2));
        System.out.println(Long.toBinaryString(-3));
    }
}
