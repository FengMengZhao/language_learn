public class LongestCommonSequence{

	public static int lcs(String[] A, int a, String[]B, int b){
		if(a == 0 || b == 0){
			return 0 ;
		}

		if(A[a-1].equalsIgnoreCase(B[b-1])){
			return lcs(A, a-1, B, b-1)+1 ;
		}else{
			return lcs(A, a-1, B, b) > lcs(A, a, B, b-1) ? lcs(A, a-1, B, b) : lcs(A, a, B, b-1) ;
		}
	}

	public static int[][] lcsDp(String[] A, String[] B){
		int a = A.length ;
		int b = B.length ;
		int[][] c = new int[a+1][b+1] ;
		for(int i=0,j=0; i<c.length&&j<c[0].length; i++,j++){
			c[i][0] = 0 ;
			c[0][j] = 0 ;
		}
		for(int i=1; i<c.length; i++){
			for(int j=1; j<c[0].length; j++){
				if(A[i-1].equalsIgnoreCase(B[j-1])){
					c[i][j] = c[i-1][j-1] + 1 ;
				}else if(c[i][j-1] >= c[i-1][j]){
						c[i][j] = c[i][j-1] ;
				}else{
					c[i][j] = c[i-1][j] ;
				}
			}
		}

		for(int i=0; i<a+1; i++){
			for(int j=0; j<b+1; j++){
				System.out.print(c[i][j] + "\t") ;
			}
			System.out.println() ;
		}
		return c ;
	}

	public static void print(int[][] arr, String[] A, String[] B, int a, int b){
		if(a==0 || b==0){
			return ;
		}
		if(A[a-1].equalsIgnoreCase(B[b-1])){
			System.out.print(A[a-1] + "\t") ;
			print(arr, A, B, a-1, b-1) ;
		}else if(arr[a-1][b] > arr[a][b-1]){
			print(arr, A, B, a-1, b) ;
		}else{
			print(arr, A, B, a, b-1) ;
		}
	}

	public static void main(String arggs[]){
		String[] A = {"e", "d", "u", "c", "a", "t", "i", "o", "n", "a", "l"} ;
		//String[] A = {"a", "d", "v", "a", "n", "t", "a", "g", "e"} ;
		//String[] A = {"d", "i", "d", "a", "c", "t", "i", "c", "a", "l"} ;
		String[] B = {"a", "d", "v", "a", "n", "t", "a", "g", "e"} ;

		int l = lcs(A, A.length, B, B.length) ;
		System.out.println(l) ;

		int[][] arr = lcsDp(A, B) ;

		print(arr, A, B, A.length, B.length) ;
	}
}/* output:
4
0	0	0	0	0	0	0	0	0	0	
0	0	0	0	0	0	0	0	0	1	
0	0	1	1	1	1	1	1	1	1	
0	0	1	1	1	1	1	1	1	1	
0	0	1	1	1	1	1	1	1	1	
0	1	1	1	2	2	2	2	2	2	
0	1	1	1	2	2	3	3	3	3	
0	1	1	1	2	2	3	3	3	3	
0	1	1	1	2	2	3	3	3	3	
0	1	1	1	2	3	3	3	3	3	
0	1	1	1	2	3	3	4	4	4	
0	1	1	1	2	3	3	4	4	4	
a	n	a	d	[Finished in 0.7s]
*/