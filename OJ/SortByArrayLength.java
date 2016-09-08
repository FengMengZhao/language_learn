import java.util.*;

public class SortByArrayLength {
	private static Random rand = new Random(26);
	
	public static void sortByArrayLength(List<Integer[]> ls){
		Collections.sort(ls, new Comparator<Integer[]>(){
			public int compare(Integer[] o1, Integer[] o2){
				//return o1.length > o2.length ? 1 : (o1.length < o2.length ? -1 : 1);
				if(o1.length > o2.length) return 1;
				else if(o1.length < o2.length) return -1;
				else{
					int i = 0;
					while(i < o1.length){
						if(o1[i] == o2[i]) i++;
						else return o1[i].compareTo(o2[i]);
					}
					return 1;
				}
			}				
		});
	}
	public static void main(String arg[]){
		List<Integer[]> ls = new ArrayList<Integer[]>();
		for(int i = 0; i < 5000; i++)
			ls.add(new Integer[rand.nextInt(20)]);
		for(Integer[] I : ls)
			for(int i = 0; i < I.length; i++)
				I[i] = rand.nextInt(50);
		sortByArrayLength(ls);
		for(Integer[] I : ls)
			System.out.println(Arrays.toString(I));
	}
}
