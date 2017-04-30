/*
Implement regular expression matching with support for '.' and '*'.

'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") ¡ú false
isMatch("aa","aa") ¡ú true
isMatch("aaa","aa") ¡ú false
isMatch("aa", "a*") ¡ú true
isMatch("aa", ".*") ¡ú true
isMatch("ab", ".*") ¡ú true
isMatch("aab", "c*a*b") ¡ú true
 */
import java.util.regex.*;
public class RegularExpressionMatching_10 {
	public boolean isMatch(String s, String p) {
		Pattern pattern = Pattern.compile(p);
		Matcher m = pattern.matcher(s);
		return m.matches();
        
    }
	
	public static void main(String arg[]){
		RegularExpressionMatching_10 rem = new RegularExpressionMatching_10();
		System.out.println(rem.isMatch("aa","a"));
		System.out.println(rem.isMatch("aa","aa"));
		System.out.println(rem.isMatch("aaa","aa"));
		System.out.println(rem.isMatch("aa","a*"));
		System.out.println(rem.isMatch("aa",".*"));
		System.out.println(rem.isMatch("ab",".*"));
		System.out.println(rem.isMatch("aab","c*a*b*"));
	}
}
