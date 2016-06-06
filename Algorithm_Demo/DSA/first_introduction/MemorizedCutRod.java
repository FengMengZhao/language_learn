public class MemorizedCutRod{

	public static int memorizedCutRod(int[] p, int n){
		int[] r = new int[n] ;
		for(int i=0; i<n; i++){
			r[i] = Integer.MIN_VALUE ;
		}
		return memorizedCutRodAux(p, n, r) ;
	}

	public static int memorizedCutRodAux(int[] p, int n, int[] r){
		
		if(n == 0){
			return 0 ;
		}

		if(r[n-1] >= 0){
			return r[n-1] ;
		}

		int q = Integer.MIN_VALUE ;

		for(int i=0; i<n; i++){
			q = Math.max(q, p[i]+memorizedCutRodAux(p, n-i-1, r)) ;
		}

		r[n-1] = q ;

		return q ;
	}

	public static void main(String args[]){
		int[] p = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30, 32, 33, 36, 40, 42, 44, 47, 49, 52, 55, 56, 58, 60, 62, 68, 70, 75, 77, 80} ;
		int q = memorizedCutRod(p, p.length) ;
		System.out.println(p.length) ;
		System.out.println(q) ;
	}
}/* output:
29
85
[Finished in 0.6s]
*/