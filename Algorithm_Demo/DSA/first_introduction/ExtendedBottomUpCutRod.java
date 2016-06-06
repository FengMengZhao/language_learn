import java.util.* ;

class CutRodResult{
	private int[] r ;
	private int[] s ;

	public CutRodResult(int[] r, int[] s){
		this.r = r ;
		this.s = s ;
	}

	public int[] getR(){
		return r ;
	}
	public int[] getS(){
		return s ;
	}
}

public class ExtendedBottomUpCutRod{

	public static CutRodResult extendedBottomUpCutRod(int[] p, int n){
		int[] r = new int[n+1] ;
		int[] s = new int[n+1] ;
		r[0] = 0 ;

		for(int j=1; j<=n; j++){
			int q = Integer.MIN_VALUE ;
			for(int i=1; i<=j; i++){
				if(q < p[i-1]+r[j-i]){
					q = p[i-1]+r[j-i] ;
					s[j] = i ;
					r[j] = q ;
				}
			}
		}

		return new CutRodResult(r, s) ;
	}

	public static void printCutRodSolution(int[] s, int n){
		while(n > 0){
			System.out.print(s[n]+"\t") ;
			n = n-s[n] ;
		}
	}

	public static void main(String args[]){
		int[] p = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30, 32, 33, 36, 40, 42, 44, 47, 49, 52, 55, 56, 58, 60, 62, 68, 70, 75, 77, 80} ;
		CutRodResult crr = extendedBottomUpCutRod(p, p.length) ;
		int[] r = crr.getR() ;
		int[] s = crr.getS() ;
		for(int ri : r){
			System.out.print(ri + "\t") ;
		}
		System.out.println() ;
		for(int si : s){
			System.out.print(si + "\t") ;
		}
		System.out.println() ;
		printCutRodSolution(s, p.length) ;
	}

}/* output:
0	1	5	8	10	13	17	18	22	25	30	32	35	38	40	43	47	49	52	55	60	62	65	68	70	73	77	79	82	85	
0	1	2	3	2	2	6	1	2	3	10	11	2	3	2	2	6	6	2	3	10	10	2	3	2	2	6	6	2	3	
3	6	10	10	[Finished in 0.7s]
*/