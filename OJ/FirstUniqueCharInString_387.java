public class FirstUniqueCharInString_387{
    public int firstUniqChar(String s){
        int i = 0;
        while(i < s.length()){
            char c = s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c))
                return i;
            i++;
        }
        return -1;
    }

    public static void main(String args[]){
        System.out.println(new FirstUniqueCharInString_387().firstUniqChar("leetcode"));
        System.out.println(new FirstUniqueCharInString_387().firstUniqChar("loveleetcode"));
        System.out.println(new FirstUniqueCharInString_387().firstUniqChar("cc"));
    }
}
