import java.util.* ;

public class BubbleSortImpro{
	static void bubbleSortImpro(int[] A, int lo, int hi){
		boolean sorted = false ;
		while(sorted = !sorted){
			for(int i=0; i<hi-1; i++){
				if(A[i] > A[i+1]){
					int temp = A[i] ;
					A[i] = A[i+1] ;
					A[i+1] = temp ;
					sorted = false ;
				}
			}
			hi -- ;
		}
	}

	public static void main(String args[]){
		int[] A = new int[100000] ; 
		Random rand = new Random(26) ;
		for(int i=0; i<A.length; i++){
			A[i] = rand.nextInt(10) ;
		}
		//int[] A = {2, 8, 7, 6} ;
		bubbleSortImpro(A, 0, A.length) ;

		for(int a : A){
			System.out.print(a + "\t") ;
		}
	}
}/* output
2	3	3	4	4	4	7	7	7	9	[Finished in 0.6s]
*/