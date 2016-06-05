public class SumArray2{
	
	int sum(int[] A, int lo, int hi){
		if(lo == hi){
			return A[lo] ;
		}else{
			int m = (lo + hi) / 2 ;
			return sum(A, lo, m) + sum(A, m+1, hi) ;
		}
	}

	public static void main(String args[]){
		int[] A = {1, 2, 3, 4, 5, 6} ;
		SumArray2 sa2 = new SumArray2() ;
		int sum = sa2.sum(A, 0, A.length-1) ;
		System.out.println(sum) ;
	}
}/* output:
21
*/