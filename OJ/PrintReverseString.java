public class PrintReverseString{
    public void printReverse(String s){
        if(s.isEmpty())
            return;
        else{
            printReverse(s.substring(1));
            System.out.print(s.charAt(0));
        }
    }

    public String reverseString(String s){
        if(s.isEmpty())
            return "";
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String args[]){
        PrintReverseString ps = new PrintReverseString();
        ps.printReverse("fmzcll");
        System.out.println();
        System.out.println(ps.reverseString("llczmf"));
    }
}
