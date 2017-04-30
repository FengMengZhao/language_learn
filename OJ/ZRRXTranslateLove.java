import java.util.LinkedList;
import java.util.Scanner;

public class ZRRXTranslateLove{
    public String reverseSentance(String str) {
        StringBuilder revStr = new StringBuilder("");
        int end = str.length(); // substring takes the end index -1
        int counter = str.length()-1;
        for (int i = str.length()-1; i >= 0; i--) {     
            if (str.charAt(i) == ' ' || i == 0) {
                if (i != 0) {
                    revStr.append(str.substring(i+1, end));
                    revStr.append(" ");
                }
                else {
                    revStr.append(str.substring(i,end));
                }
                end = counter;
            }
            counter--;
        }
        return revStr.toString();
    }
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()){
            int lines = Integer.parseInt(s.nextLine());
            for(int i = 0; i < lines; i++){
                String str = s.nextLine();
                System.out.println(new ZRRXTranslateLove().reverseSentance(str));
            }
        }
        s.close();
    }
}
