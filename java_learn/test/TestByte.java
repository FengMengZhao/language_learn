public class TestByte{
    public static void main(String args[]){
        System.out.println(Byte.MIN_VALUE) ;
        System.out.println(Byte.MAX_VALUE) ;
        System.out.println(0xfe) ;
        byte value = (byte)0xfe ;
        System.out.println(value) ;
        int result = value ;
        System.out.println(result) ;
        System.out.println((byte)0xfe & 0xff) ;
    }
}
