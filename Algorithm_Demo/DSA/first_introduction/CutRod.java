public class CutRod{

	public static int cutRod(int[] p, int n){
		if(n == 0){
			return 0 ;
		}

		int q = Integer.MIN_VALUE ;

		for(int i=0; i<n; i++){
			q = Math.max(q, p[i]+cutRod(p, n-i-1)) ;
		}
		return q ;
	}

	public static void main(String args[]){
		int[] p = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30, 32, 33, 36, 40, 42, 44, 47, 49, 52, 55, 56, 58, 60, 62, 68, 70, 75, 77, 80} ;
		int q = cutRod(p, p.length) ;
		System.out.println(p.length) ;
		System.out.println(q) ;
	}
}/* output:
29
85
[Finished in 2.5s]
*/