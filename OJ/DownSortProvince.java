import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* 网易笔试题
 * 给定一个数组，统计每一个int数组内的数值出现的次数
 * 按数值出现次数的降序输出，输出次数相同的按数值的字典顺序输出，只输出数值
 * 输入：[2, 2, 4, 1, 8, 3, 4, 2]
 * 输出：2 4 1 3 8
 */
public class DownSortProvince {
	public static <K extends Comparable<? super K>, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map){
		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>(){
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2){
				int flag = -o1.getValue().compareTo(o2.getValue());
				return flag != 0 ? flag : o1.getKey().compareTo(o2.getKey());
			}
		});
		
		Map<K, V> result = new LinkedHashMap<K, V>();
		for(Map.Entry<K, V> entry : list){
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}
	
	public static <K extends Comparable<? super K>> Map<K, Integer> countFreq(K[] arr){
		Map<K, Integer> count_map = new LinkedHashMap<K, Integer>();
		for(K k : arr){
			Integer freq = count_map.get(k);
			count_map.put(k, freq == null ? 1 : freq + 1);
		}
		return count_map;
	}
	
	private static Random rand = new Random(26);
	
	public static void main(String args[]){
		Integer[] arr = new Integer[1000];
		for(int i = 0; i < arr.length; i++)
			arr[i] = rand.nextInt(128);
		
		Map<Integer, Integer> count_res = countFreq(arr);
		System.out.println(count_res);
		count_res = sortByValue(count_res);
		System.out.println(count_res);
	}
	
}
