package org.fmz.container ;

public class Search{

	private Search(){}

	public static int binSearch(Vector vec, Comparable target){
		int first = 0,
			last = vec.size(),
			middle ;
		while(last - first >= 0){
			middle = (first + last) / 2 ;
			if(target.compareTo(vec.elementAt(middle)) < 0)
				last = middle-1 ;
			else if(target.compareTo(vec.elementAt(middle)) > 0)
				first = middle+1 ;
			else
				return middle ;
		}
		return -1 ;
	}

	public static int linearSearch(Vector vec, Comparable target){
		int j,
			n = vec.size() ;
		for(j=0; j<n && target.compareTo(vec.elementAt(j))>0; j++) ;
		if(j<n && target.compareTo(vec.elementAt(j)) == 0)
			return j ;
		return -1 ;
	}
}