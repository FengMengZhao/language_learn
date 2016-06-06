public class BottomUpCutRod{
	public static int bottomUpCutRod(int[] p, int n){
		int[] r = new int[n+1] ;
		r[0] = 0 ;

		for(int j=1; j<=n; j++){
			int q = Integer.MIN_VALUE ;

			for(int i=1; i<=j; i++){
				q = Math.max(q, p[i-1]+r[j-i]) ;
			}
			r[j] = q ;
		}

		return r[n] ;
	}

	public static void main(String args[]){
		int[] p = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30, 32, 33, 36, 40, 42, 44, 47, 49, 52, 55, 56, 58, 60, 62, 68, 70, 75, 77, 80} ;
		int q = bottomUpCutRod(p, p.length) ;
		System.out.println(p.length) ;
		System.out.println(q) ;
	}
}/* output:
29
85
[Finished in 0.6s]
*/