public class PlusOne_66{
    public int[] plusOne(int[] digits){
        boolean flag = false;
        int len = digits.length;
        while(flag = !flag && len > 0){
            if(digits[len - 1] != 9){
                digits[len - 1]++;
            }else{
                digits[len - 1] = 0;
                flag = false;
            }
            len--;
        }

        int[] res;
        if(digits[0] == 0){
            res = new int[digits.length + 1];
            res[0] = 1;
            System.arraycopy(digits, 0, res, 1, len);
        }else res = digits;
        return res;
    }

    public static void main(String args[]){
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        //int[] digits = {9,9,9};
        int[] res = new PlusOne_66().plusOne(digits);
        for(int i : res)
            System.out.print(i + ", ");
    }
}
