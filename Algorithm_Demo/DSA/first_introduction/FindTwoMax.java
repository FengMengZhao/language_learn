class MyResult{
	private int max_index ;
	private int sub_max_index ;

	public MyResult(int max_index, int sub_max_index){
		this.max_index = max_index ;
		this.sub_max_index = sub_max_index ;
	}

	public int getMaxIndex(){
		return this.max_index ;
	}
	public int getSubMaxIndex(){
		return this.sub_max_index ;
	}
}

public class FindTwoMax{

	MyResult max(int[] A, int lo, int hi){
		int max_index = lo ;
		for(int i = lo+1; i<hi; i++){
			if(A[max_index] < A[i]){
				max_index = i ;
			}
		}
		int sub_max_index = lo;
		for(int i = lo+1; i<max_index; i++){
			if(A[sub_max_index] < A[i]){
				sub_max_index = i ;
			}
		}
		for(int i = max_index+1; i<hi; i++){
			if(A[sub_max_index] < A[i]){
				sub_max_index = i ;
			}
		}
		return new MyResult(max_index, sub_max_index) ;
	}

	public static void main(String args[]){
		FindTwoMax ftm = new FindTwoMax() ;
		int[] A = {1, 3, 7, 1, 5, 2, 6, 9} ;
		MyResult mr = ftm.max(A, 0, A.length) ;
		System.out.println("max_index: " + mr.getMaxIndex() + " sub_max_index: " + mr.getSubMaxIndex()) ;
	}
}