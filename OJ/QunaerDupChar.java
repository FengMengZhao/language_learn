import java.util.*;

public class QunaerDupChar{
    public boolean isSameComposite(String one, String another){
        Set<Character> set1 = new TreeSet<>();
        Set<Character> set2 = new TreeSet<>();
        for(char c : one.toCharArray())
            set1.add(c);
        for(char c : another.toCharArray())
            set2.add(c);
        return set1.equals(set2);
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()){
            String str = s.nextLine();
            String[] arr = str.split(" ");
            String one = arr[0];
            String another = arr[1];
            System.out.println(new QunaerDupChar().isSameComposite(one, another));
        }
    }
}
