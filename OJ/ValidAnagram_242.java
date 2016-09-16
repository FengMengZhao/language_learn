import java.util.*;

public class ValidAnagram_242{
    public boolean isAnagram(String s, String t){
        /*
        int tmp_s = 0;
        int tmp_t = 0;
        for(char c : s.toCharArray())
            tmp_s += c;
        for(char c : t.toCharArray())
            tmp_t += c;
        return tmp_s == tmp_t && s.length() == t.length();
        */

        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();
        Arrays.sort(s_char);
        Arrays.sort(t_char);
        return new String(s_char).equals(new String(t_char));
    }

    public static void main(String args[]){
        System.out.println(new ValidAnagram_242().isAnagram("anagram", "nagaram"));
        System.out.println(new ValidAnagram_242().isAnagram("rat", "car"));
        System.out.println(new ValidAnagram_242().isAnagram("ac", "bb"));
    }
}
