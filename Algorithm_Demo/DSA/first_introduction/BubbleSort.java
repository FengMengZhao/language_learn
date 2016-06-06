import java.util.* ;

public class BubbleSort{

	void bubbleSort(int[] A, int n){
		for(boolean flag = false; flag = !flag; n--){
			for(int i=0; i<n-1; i++){
				if(A[i] > A[i+1]){
					int exchange = A[i] ;
					A[i] = A[i+1] ;
					A[i+1] = exchange ;
					flag = false ;
				}
			}
		}	
	}

	void bubbleSort2(int[] A, int n){
		boolean sorted = false ;
		while(sorted = !sorted){
			for(int i=0; i<n-1; i++){
				if(A[i] > A[i+1]){
					int temp = A[i] ;
					A[i] = A[i+1] ;
					A[i+1] = temp ;
					sorted = false ;
				}
			}
		}
	}

	public static void main(String args[]){
		BubbleSort bs = new BubbleSort() ;
		int[] A = new int[50000] ;
		Random rand = new Random(26) ;
		for(int i=0; i<A.length; i++){
			A[i] = rand.nextInt(100) ;
		}
		//bs.bubbleSort(A, A.length) ;
		bs.bubbleSort2(A, A.length) ;

		for(int a : A){
			System.out.print(a + "\t") ;
		}
	}
}/* output:

1	2	2	3	4	4	5	5	6	7	[Finished in 0.6s]

*/