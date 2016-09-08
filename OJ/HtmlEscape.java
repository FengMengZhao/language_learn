import java.util.HashMap;
import java.util.Map;

/* 网易有道笔试题
 * HTML转义，可以是UNICODE转义，例如"￥"转义为"&#165"；也可以是字符转义，例如"\""转义为"&quot"
 * 给定已经转义的字符，将之转化为普通字符
 * E.g. 
 * Input: &lt;h1&gt;&#165;&lt;/h1&gt;
 * Output: <h1>￥</h1>
 * 除了UNICODE转义之外的能用到的转义
 * "	&#34;	&quot;
 * &	&#38;	&amp;
 * <	&#60;	&lt;
 * >	&#62;	&gt;
 * non-breaking space	&#160;	&nbsp;
 */
public class HtmlEscape {
	private static Map<String, String> html_escape =
			new HashMap<String, String>();
	static{
		html_escape.put("&quot", "\"");
		html_escape.put("&amp", "&");
		html_escape.put("&lt", "<");
		html_escape.put("&gt", ">");
		html_escape.put("&nbsp", " ");
	}
	
	public static String html_decode(String str){
		String result = "";
		
		String[] str_arr = str.split(";");
		for(int i = 0; i < str_arr.length; i++)
			str_arr[i] = diffSitu(str_arr[i]);
		for(String s : str_arr)
			result += s;
		return result;
	}
	
	public static String diffSitu(String str){
		if(str.contains("&#")){
			int index = str.indexOf("&#");
			String pre_sub = str.substring(0, index);
			String post_sub = str.substring(index + 2, str.length());
			post_sub = (char)Integer.parseInt(post_sub) + "";
			return pre_sub + post_sub;
		}else if(str.contains("&")){
			int index = str.indexOf("&");
			String key = str.substring(index, str.length());
			String value = html_escape.get(key);
			return str.substring(0, index) + value;
		}else
			return str;
	}
	
	public static void main(String args[]){
		//String input = "&lt;h1&gt;&#165;&quot;fmz&quot;&#165;&lt;/h1&gt;";
		String input = "&lt;fmzcll&gt;";
		System.out.println(html_decode(input));
	}
}
