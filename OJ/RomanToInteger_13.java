public class RomanToInteger_13{
    public int romanToInt(String s){
        String roman = "IVXLCDM";
        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        int init_index = roman.indexOf(s.charAt(0));
        int value = values[init_index];
        for(int i = 1; i < s.length(); i++){
            int cur_index = roman.indexOf(s.charAt(i));
            if(init_index < cur_index)
                value += (values[cur_index] - (values[init_index] << 1));
            else value += values[cur_index];
            init_index = cur_index;
        }
        return value;
    }

    public static void main(String args[]){
        System.out.println(new RomanToInteger_13().romanToInt("VI"));
        System.out.println(new RomanToInteger_13().romanToInt("XI"));
        System.out.println(new RomanToInteger_13().romanToInt("IV"));
        System.out.println(new RomanToInteger_13().romanToInt("IX"));
        System.out.println(new RomanToInteger_13().romanToInt("XIV"));
        System.out.println(new RomanToInteger_13().romanToInt("XCIX"));
    }
}
