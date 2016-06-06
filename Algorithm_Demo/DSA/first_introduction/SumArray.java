public class SumArray{

	int sum(int[] A, int n){
		return (n < 1) ?
			0 : sum(A, n-1) + A[n-1] ;
	}
	
	public static void main(String args[]){
		int[] A = {1, 2, 3, 4, 5} ;

		SumArray sa = new SumArray() ;
		int sum = sa.sum(A, A.length) ;
		System.out.println(sum) ;
	}
}/* output:
15
*/