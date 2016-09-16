public class RansomNode_383_Elegant{
    public boolean canConstruct(String ransomNode, String magazine){
        int[] arr = new int[26];
        for(char c : magazine.toCharArray())
            arr[c - 'a']++;
        for(char c : ransomNode.toCharArray()){
            if(--arr[c - 'a'] < 0)
                return false;
        }
        return true;
    }
    public static void main(String args[]) {
        System.out.println(new RansomNote_383_Elegant().canConstruct("a", "b"));
        System.out.println(new RansomNote_383_Elegant().canConstruct("abcdac", "abcadcef"));
        System.out.println(new RansomNote_383_Elegant().canConstruct("abccda", "aabcdcmn"));
        System.out.println(new RansomNote_383_Elegant().canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi"));
    }
}
