import java.util.* ;
public class MergeSort{
	static void mergeSort(int[] A, int lo, int hi){
		if(lo+1 == hi){
			return ;
		}

		if(lo+1 < hi){
			int mid = (lo+hi)/2 ;

			mergeSort(A, lo, mid) ;
			mergeSort(A, mid, hi) ;

			merge(A, lo, mid, hi) ;
		}
	}

	private static void merge(int[] A, int lo, int mid, int hi){
		int[] A_left = new int[mid-lo+1] ;
		int[] A_right = new int[hi-mid+1] ;

		for(int i=0; i<A_left.length-1; i++){
			A_left[i] = A[lo+i] ;
		}
		for(int j=0; j<A_right.length-1; j++){
			A_right[j] = A[mid+j] ;
		}

		A_left[A_left.length-1] = Integer.MAX_VALUE ; //哨兵元素
		A_right[A_right.length-1] = Integer.MAX_VALUE ; // 哨兵元素

		int i = 0 ;
		int j = 0 ;
		for(int k=lo; k<hi; k++){
			if(A_left[i] < A_right[j]){
				A[k] = A_left[i] ;
				i++ ;
			}else{
				A[k] = A_right[j] ;
				j++ ;
			}
		}
	}

	public static void main(String args[]){
		///*
		int[] A = new int[10] ; 
		Random rand = new Random(26) ;
		for(int i=0; i<A.length; i++){
			A[i] = rand.nextInt(10) ;
		}
		//*/
		//int[] A = {2, 4, 6, 1, 7, 8, 9} ;
		for(int i : A){
			System.out.print(i + "\t") ;
		}
		System.out.println() ;
		//int[] A = {3, 2} ;
		mergeSort(A, 0, A.length) ;
		//merge(A, 0, A.length/2, A.length) ;
		for(int i : A){
			System.out.print(i + "\t") ;
		}
	}
}