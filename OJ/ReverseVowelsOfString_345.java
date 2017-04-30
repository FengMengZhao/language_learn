public class  ReverseVowelsOfString_345{
    public String reverseVowels(String s){
        String vowels = "aeiou";
        int[] flag = new int[s.length()];
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++){
            if(vowels.contains(String.valueOf(c[i]))){
                sb.append(c[i]);
                flag[i] = 1;
            }
        }
        System.out.println(sb.toString());
        char[] c_new = sb.reverse().toString().toCharArray();
        int j = 0;
        for(int i = 0; i < flag.length; i++){
            if(flag[i] == 1)
                c[i] = c_new[j++];
        }
        return new String(c);
    }

    public static void main(String args[]){
        System.out.println(new ReverseVowelsOfString_345().reverseVowels("hello"));
        System.out.println(new ReverseVowelsOfString_345().reverseVowels("leetcode"));
        System.out.println(new ReverseVowelsOfString_345().reverseVowels(""));
    }
}
