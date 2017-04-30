import java.util.*;

public class WeiDianMatchesBrackets{
    public boolean isMatched(String brackets){
        LinkedList<String> ls = new LinkedList<>();
        for(String str : brackets.split("")){
            if(str.equals("("))
                ls.addFirst(str);
            else{
                if(ls.size() == 0)
                    return false;
                ls.removeFirst();
            }
        }
        return ls.size() == 0;
    }

    public static void main(String args[]){
        System.out.println(new WeiDianMatchesBrackets().isMatched("((((())))"));
    }
}
