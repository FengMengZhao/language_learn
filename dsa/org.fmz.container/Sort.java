package org.fmz.container ;

public class Sort{

	private Sort() {}

	public static void swap(Vector vec, int first, int second){
		Object temp = vec.elementAt(first) ;
		vec.replace(first, vec.elementAt(second)) ;
		vec.replace(second, temp) ;
	}

	public static void bubbleSort(Vector vec){
		int i,
			j,
			n=vec.size() ;
		Comparable first ;
		Comparable second ;
		for(i=n-1; i>0; i--){
			for(j=1; j<=i; j++){
				first = (Comparable)vec.elementAt(j-1) ;
				second = (Comparable)vec.elementAt(j) ;
				if(!(first.compareTo(second)<0)){
					swap(vec, j-1, j) ;
				}
			}	
		}
	}

	public static void selectionSort(Vector vec){
		int i,
			j,
			n = vec.size(), 
			small_pos ;
		Comparable smallest,
				   current ;
		for(i=0; i<n-1; i++){
			small_pos = i ;
			smallest = (Comparable)vec.elementAt(small_pos) ;
			for(j=i+1; j<n; j++){
				current = (Comparable)vec.elementAt(j) ;
				if(current.compareTo(smallest) > 0){
					small_pos = j ;
					smallest = (Comparable)vec.elementAt(small_pos) ;
				}
			}
			if(small_pos != i)
				swap(vec, i, small_pos) ;
		}
	}
}