public class ExcelSheetColumnNum_171{
    public int titleToNumber(String s){
        int res = 0;
        for(int i = s.length(); i > 0; i--){
            char c = s.charAt(s.length() - i);
            res += (c - 'A' + 1) * (int)Math.pow(26, i - 1);
        }
        return res;
    }

    public static void main(String args[]){
        System.out.println(new ExcelSheetColumnNum_171().titleToNumber("A"));
        System.out.println(new ExcelSheetColumnNum_171().titleToNumber("B"));
        System.out.println(new ExcelSheetColumnNum_171().titleToNumber("C"));
        System.out.println(new ExcelSheetColumnNum_171().titleToNumber("Z"));
        System.out.println(new ExcelSheetColumnNum_171().titleToNumber("AA"));
        System.out.println(new ExcelSheetColumnNum_171().titleToNumber("AB"));
    }
}
