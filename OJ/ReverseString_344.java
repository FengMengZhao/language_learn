public class ReverseString_344 {
	public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String... args){
        String s = "fmzcll";
        s = "";
        System.out.println("Reversed string: " + new ReverseString_344().reverseString(s));
    }
}
