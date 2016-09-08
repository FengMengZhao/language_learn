import java.util.Arrays;

/*
 * Given the greater than zero Integer, total n! number permutation
 * The permutation is ordered by the dictionary
 * Give you one of the permutation, program to find the next one
 * E.g.
 * Input: n = 3 and the permutation is 213
 * Output: 231 
 */
public class NextFullPermutationNumber {
	public static int nextPermutation(int perm){
		String str_perm = "" + perm;
		
		int index = str_perm.length() - 2;
		while(index >= 0){
			if(str_perm.charAt(index) > str_perm.charAt(index + 1))
				index--;
			else break; 
		}
		
		int index_to_swap = index + 1;
		while(index_to_swap < str_perm.length()){
			if(str_perm.charAt(index) < str_perm.charAt(index_to_swap))
				index_to_swap++;
			else break;
		}
		index_to_swap--;
		
		char[] char_arr_perm = str_perm.toCharArray();
		char tmp = char_arr_perm[index];
		char_arr_perm[index] = char_arr_perm[index_to_swap];
		char_arr_perm[index_to_swap] = tmp;
		
		char[] sub_arr = new char[char_arr_perm.length - index -1];
		for(int i = 0; i < sub_arr.length; i++)
			sub_arr[i] = char_arr_perm[i + index + 1];
		Arrays.sort(sub_arr);
		for(int i = 0; i < sub_arr.length; i++)
			char_arr_perm[i + index + 1] = sub_arr[i];
		return Integer.parseInt(new String(char_arr_perm));
	}
	
	public static void main(String args[]){
		System.out.println(nextPermutation(765984321));
	}
}
