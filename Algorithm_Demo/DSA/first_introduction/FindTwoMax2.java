public class FindTwoMax2{
	MyResult max(int[] A, int lo, int hi){
		int max_index = lo;
		int sub_max_index = lo+1;
		if(A[lo] < A[lo+1]){
			max_index = lo+1 ;
			sub_max_index = lo ;
		}
		for(int i=lo+2; i<hi; i++){
			if(A[i] > A[sub_max_index]){
				sub_max_index = i ;
				if(A[i] > A[max_index]){
					sub_max_index = max_index ;
					max_index = i ;
				}
			}
		}

		return new MyResult(max_index, sub_max_index) ;
	}

	public static void main(String args[]){
		FindTwoMax2 ftm2 = new FindTwoMax2() ;
		int[] A = {1, 3, 7} ;
		MyResult mr = ftm2.max(A, 0, A.length) ;
		System.out.println("max_index: " + mr.getMaxIndex() + " sub_max_index: " + mr.getSubMaxIndex()) ;
	}
}