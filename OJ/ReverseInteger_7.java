
public class ReverseInteger_7 {
	public int reverse(int x) {
        String str = new StringBuilder(x+"").reverse().toString();
        if(!Character.isDigit(str.charAt(str.length()-1))){
        	str = str.charAt(str.length()-1)+str.substring(0, str.length()-1);
        }
        long num = Long.parseLong(str);
        if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE)
        	return 0;
        return Integer.parseInt(str);
    }
	
	public static void main(String args[]){
		ReverseInteger_7 ri = new ReverseInteger_7();
		System.out.println(ri.reverse(1534236469));
	}
}
