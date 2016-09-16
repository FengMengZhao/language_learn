public class FindTheDifference_389{
    public char findTheDifference(String s, String t){
        int s_res = 0;
        int t_res = 0;
        for(char c : s.toCharArray())
            s_res += c;
        for(char c : t.toCharArray())
            t_res += c;
        int diff = t_res - s_res;
        return (char)diff;
    }

    public static void main(String args[]){
        System.out.println(new FindTheDifference_389().findTheDifference("", "a"));
    }
}
