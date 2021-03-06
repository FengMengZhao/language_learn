
public class StringToInteger_8 {
	public int myAtoi(String str) {
		/*
        if(str.equals("") || str.equals("+") || str.equals("-"))
            return 0;
        return Integer.parseInt(str);
        */
        int index = 0, sign = 1, total = 0;
        //Empty string
        if(str.length() == 0) return 0;

        //Remove Spaces
        while(index < str.length() && str.charAt(index) == ' ')
            index ++;

        //Handle signs
        if(index < str.length()){
	        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
	            sign = str.charAt(index) == '+' ? 1 : -1;
	            index ++;
	        }
        }else
        	return 0;
        
        //Convert number and avoid overflow
        while(index < str.length()){
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;

            //check if total will be overflow after 10 times and add digit
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = 10 * total + digit;
            index ++;
        }
        return total * sign;
    }
}
