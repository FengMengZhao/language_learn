import java.util.*;

public class WeiDianCheckWord{
    public static boolean checkWord(String origin, String target){
        List<Character> ls_1 = new LinkedList<>();
        for(Character c : origin.toCharArray())
            Collections.addAll(ls_1, c);
        List<Character> ls_2 = new LinkedList<>();
        for(Character c : target.toCharArray())
            Collections.addAll(ls_2, c);

        int j = 0;
        Iterator<Character> iter = ls_1.iterator();
        while(iter.hasNext()) {
            if((char)iter.next() == (char)ls_2.get(j))
                j++;
        }

        return j == ls_2.size();
    }

    public static void main(String args[]){
        System.out.println(checkWord("abcdef", "bdf"));
        System.out.println(checkWord("abcefdf", "bdf"));
    }
}
