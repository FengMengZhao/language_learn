public class ReverseArray{
	public static void swap(int[] A, int lo, int hi){
		int temp = A[lo] ;
		A[lo] = A[hi] ;
		A[hi] = temp ;
 	}

	void reverse(int[] A, int lo, int hi){
		if(lo < hi){
			swap(A, lo, hi) ;
			reverse(A, lo+1, hi-1) ;
		}else{
			return ;
		}
	}

	public static void main(String args[]){
		int[] A = {1, 5, 2, 3, 7, 4, 5, 6} ;
		ReverseArray ra = new ReverseArray() ;
		ra.reverse(A, 0, A.length-1) ;

		for(int a : A){
			System.out.print(a + "\t") ;
 		}
	}
}/* output:
6       5       4       7       3       2       5       1
*/