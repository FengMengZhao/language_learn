/*
 * 用分而治之的思想解决寻找序列当中的两个最大的数
 */
public  class FindTwoMax3{
	MyResult findTwoMax3(int[] A, int lo, int hi){
		int max_index ;
		int  sub_max_index ;

		if(A.length <= 1){
			System.exit(1) ;
		}
		if(lo+2 == hi){
			if(A[lo] > A[lo+1]){
				max_index = lo ;
				sub_max_index = lo+1 ;
			}else{
				max_index = lo+1 ;
				sub_max_index = lo ;
			}
			return new MyResult(max_index, sub_max_index) ;
		}
		if(lo+3 == hi){
			int max = A[lo] ;
			max_index = lo ;
			if(A[lo+1] > max){
				max = A[lo+1] ;
				max_index = lo+1 ;
			}
			if(A[lo+2] > max){
				max = A[lo+2] ;
				max_index = lo+2 ;
			}

			if(lo != max_index){
				int sub = A[lo] ;
				sub_max_index = lo ;
				if(lo+1 == max_index){
					if(A[lo+2] > sub){
						sub_max_index = lo+2 ;
					}
				}else{
					if(A[lo+1] > sub){
						sub_max_index = lo+1 ;
					}
				}
			}else{
				if(A[lo+1] > A[lo+2]){
					sub_max_index = lo+1 ;
				}else{
					sub_max_index = lo+2 ;
				}
			}
			return new MyResult(max_index, sub_max_index) ;
		}

		int mi = (lo+hi)/2 ;
		MyResult mrl = findTwoMax3(A, lo, mi) ;
		MyResult mrr = findTwoMax3(A, mi, hi) ;

		if(A[mrl.getMaxIndex()] > A[mrr.getMaxIndex()]){
			max_index = mrl.getMaxIndex() ;
			sub_max_index = (A[mrl.getSubMaxIndex()] > A[mrr.getMaxIndex()]) ? mrl.getSubMaxIndex() : mrr.getMaxIndex() ;
		}else{
			max_index = mrr.getMaxIndex() ;
			sub_max_index = (A[mrr.getSubMaxIndex()] > A[mrl.getMaxIndex()]) ? mrr.getSubMaxIndex() : mrl.getMaxIndex() ;
		}
		return new MyResult(max_index, sub_max_index) ;
	}

	public static void main(String args[]){
		int[] A = {5, 9, 6, 6, 7, 2, 13} ;
		FindTwoMax3 ftm3 = new FindTwoMax3() ;
		MyResult mr = ftm3.findTwoMax3(A, 0, A.length) ;
		System.out.println("Max index --> " + mr.getMaxIndex() + "\t Sub max index --> " + mr.getSubMaxIndex()) ;
	}
}