import java.util.*;

public class RansomNote_383{
    public boolean canConstruct(String ransomNote, String magazine){
        char[] ransomNote_char = ransomNote.toCharArray();
        Arrays.sort(ransomNote_char);
        ransomNote = new String(ransomNote_char);
        char[] magazine_char = magazine.toCharArray();
        Arrays.sort(magazine_char);
        magazine = new String(magazine_char);

        int res = 0;
        for(char c : magazine.toCharArray()){
            if(res == ransomNote.length())
                return true;
            if(c == ransomNote.charAt(res))
                res++;
        }
        return res == ransomNote.length();
    }
    
    public static void main(String args[]){
        System.out.println(new RansomNote_383().canConstruct("a", "b"));
        System.out.println(new RansomNote_383().canConstruct("abcdac", "abcadcef"));
        System.out.println(new RansomNote_383().canConstruct("abccda", "aabcdcmn"));
        System.out.println(new RansomNote_383().canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi"));
    }
}
