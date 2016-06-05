/*
 * 运筹学中经典的排列排序问题
 * n件物品在m个机器上进行生产
 * n件物品的生产工序相同(工序在机器上的流向相同)
 * n件物品在同所有机器的生产顺序相同
 * t_{ij}表示在第i个machine上加工第j个物品需要的加工时间
 * c_{ij}表示在第i个machine上加工完成第j个产品在的时刻(假设从时刻0开始生产)
 * 动态规划方法进行求解
 * 此处求解的是给定的各个物品顺序下最小的加工周期
 */
public class PermutationSequencing{

	public static int permutationSequencing(int[][] t){
		int m = t.length ;
		int n = t[0].length ;
		int[][] c = new int[m][n] ;
		c[0][0] = t[0][0] ;

		for(int i=1; i<m; i++){
			c[i][0] = c[i-1][0] + t[i][0] ;

			for(int j=1; j<n; j++){
				c[0][j] =c[0][j-1] + t[0][j] ; 

				c[i][j] = Math.max(c[i-1][j], c[i][j-1])+t[i][j] ;
			}
		}
		return c[m-1][n-1] ;
	}

	public static void main(String args[]){
		int[][] t = {{4, 2, 3, 1, 4, 2}, {4, 5, 6, 7, 4, 5},
						{5, 8, 7, 5, 5, 5}, {4, 2, 4, 3, 3, 1}} ;
		int[][] t2 = {{2, 4, 4, 2, 1, 3}, {5, 4, 4, 5, 7, 6},
						{5, 5, 5, 8, 5, 7}, {1, 4, 3, 2, 3, 4}} ;
		int c = permutationSequencing(t2) ;
		System.out.println(c) ;
	}
}/*output
46
[Finished in 0.7s]
*/