/* 网易在线笔试题
 * Question:
 * Given an array, find all the sub array, the array may contains duplicate element
 * Output the array, first by the order of sub array length, then by the order dictionary
 * Input separate by comma
 * E.g. 
 * Input [1,2,2,3]  
 * Output [] [1] [2] [3] [1 2] [1 3] [2 2] [2 3] [1 2 2] [1 2 3] [2 2 3] [1 2 2 3]
 */

import java.util.*;

public class FindAllTheSubArrays {
	
	public static class ComparableListArray implements
			Comparable<ComparableListArray> {
		public List<Integer> list;

		public ComparableListArray(List<Integer> ls)  {
			list = ls;
		}
		
		@Override
		public int compareTo(ComparableListArray o) {
			if (list.size() > o.list.size())
				return 1;
			else if (list.size() < o.list.size())
				return -1;
			else {
				int i = 0;
				while (i < list.size()) {
					if (list.get(i) == o.list.get(i))
						i++;
					else
						return list.get(i).compareTo(o.list.get(i));
				}
				return 0;
			}

		}
		
		
		/*
		 * When you override CompareTo() and equals(), then 
		 * the execution will skip the equals method
		 */
		@Override
		public boolean equals(Object o){
			System.out.println("*");
			if(list.size() != ((ComparableListArray)o).list.size()) return false;
			else{
				int i = 0;
				while(i < list.size()){
					if(list.get(i) == ((ComparableListArray)o).list.get(i))
						i++;
					else
						return false;
				}
				return true;
			}
		}

		public String toString() {
			return  list.toString();
		}
	}

	public static <T> Set<Set<T>> powerSet(Set<T> originalSet) {
		Set<Set<T>> sets = new HashSet<Set<T>>();
		if (originalSet.isEmpty()) {
			sets.add(new HashSet<T>());
			return sets;
		}
		List<T> list = new ArrayList<T>(originalSet);
		T head = list.get(0);
		Set<T> rest = new HashSet<T>(list.subList(1, list.size()));
		for (Set<T> set : powerSet(rest)) {
			Set<T> newSet = new HashSet<T>();
			newSet.add(head);
			newSet.addAll(set);
			sets.add(newSet);
			sets.add(set);
		}
		return sets;
	}

	public static <T> List<List<T>> powerList(List<T> original_ls) {
		List<List<T>> ls = new ArrayList<List<T>>();
		if (original_ls.isEmpty()) {
			ls.add(new ArrayList<T>());
			return ls;
		}
		List<T> list = new ArrayList<T>(original_ls);
		T head = list.get(0);
		List<T> rest = new ArrayList<T>(list.subList(1, list.size()));
		for (List<T> l : powerList(rest)) {
			List<T> newLs = new ArrayList<T>();
			newLs.add(head);
			newLs.addAll(l);
			ls.add(newLs);
			ls.add(l);
		}
		return ls;
	}

	public static Set<Integer[]> addToSet(List<Integer[]> ls) {
		Set<Integer[]> set = new TreeSet<Integer[]>(
				new Comparator<Integer[]>() {
					public int compare(Integer[] o1, Integer[] o2) {
						if (o1.length < o2.length)
							return -1;
						else if (o1.length > o2.length)
							return 1;
						else {
							int i = 0;
							while (i < o1.length) {
								if (o1[i] == o2[i])
									i++;
								else
									return o1[i].compareTo(o2[i]);
							}
							return 0;
						}
					}

				});

		for (Integer[] t : ls) {
			set.add(t);
		}
		return set;
	}

	public static Set<List<Integer>> addToSet2(List<List<Integer>> ls) {
		Set<List<Integer>> set = new TreeSet<List<Integer>>(
				new Comparator<List<Integer>>() {
					public int compare(List<Integer> o1, List<Integer> o2) {
						if (o1.size() < o2.size())
							return -1;
						else if (o1.size() > o2.size())
							return 1;
						else {
							int i = 0;
							while (i < o1.size()) {
								if (o1.get(i) == o2.get(i))
									i++;
								else
									return o1.get(i).compareTo(o2.get(i));
							}
							return 0;
						}
					}
				});

		for (List<Integer> l : ls) {
			set.add(l);
		}
		return set;
	}

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String str = in.nextLine();
			String[] arr = str.split(",");
			Integer[] int_arr = new Integer[arr.length];
			for (int i = 0; i < arr.length; i++)
				int_arr[i] = Integer.parseInt(arr[i]);
			Set<Integer> mySet = new HashSet<Integer>();
			List<Integer> myLs = new ArrayList<Integer>();

			for (int i : int_arr) {
				mySet.add(i);
				myLs.add(i);
			}
			
			for (List<Integer> s : addToSet2(powerList(myLs))) {
				System.out.println(s);
			}
			

			System.out.println("********************************");
			
			Set<ComparableListArray> set = new TreeSet<ComparableListArray>();
			for(List<Integer> l : powerList(myLs))
				set.add(new ComparableListArray(l));
			System.out.println(set);
		}
		in.close();
	}
}