public class AddDigits_258{
    public int addDigits(int num){
        String num_str = Integer.toString(num);
        /*
        if(num_str.length() == 1)
            return num;
        */
        int res = num;
        while(num_str.length() > 1){
            int tmp = 0;
            for(int i = 0; i < num_str.length(); i++){
                tmp += Character.getNumericValue(num_str.charAt(i));
            }
            num_str = Integer.toString(tmp);
            res = tmp;
        }
        return res;
    }

    public static void main(String args[]){
        //System.out.println((int)'1' + (int)'2');
        System.out.println(new AddDigits_258().addDigits(38));
    }
}
