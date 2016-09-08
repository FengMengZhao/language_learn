import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	public static void permutation(int[] array, int size){
		int[] left = new int[size];
		int[] right = new int[size];
		for(int i=0; i<size; i++){
			left[i] = array[i];
			right[i] = array[i + size];
		}
		
		int i=0;
		int l=0;
		int r=0;
		while(i < array.length && l < left.length && r < right.length){
			array[i] = left[l++];
			array[i+1] = right[r++];
			i+=2;
		}
		
	}
	
	public static void doNTimes(int k, int[] array, int size){
		int n = 0;
		while(n < k){
			permutation(array, size);
			n++;
		}
	}
	
	public static void main(String args[]){
	
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			List<Integer[]> list = new ArrayList<Integer[]>();
			int rows = Integer.parseInt(in.nextLine());
			int i = 0;
			while(i < rows){
				String[] str_arr = in.nextLine().split(" ");
				int size = Integer.parseInt(str_arr[0]);
				int k  = Integer.parseInt(str_arr[1]);
				
				String[] str_array = in.nextLine().split(" ");
				int[] array = new int[str_array.length];
				for(int j = 0; j < array.length; j++)
					array[j] = Integer.parseInt(str_array[j]);				
				doNTimes(k, array, size);
				list.add(IntStream.of(array).boxed().toArray(Integer[]::new));
				i++;
			}
			for(Integer[] I : list){
				for(int a = 0; a < I.length - 1; a++){
					System.out.print(I[a] + " ");
				}
				System.out.println(I[I.length-1]);
			}
		}
		in.close();
	}
}