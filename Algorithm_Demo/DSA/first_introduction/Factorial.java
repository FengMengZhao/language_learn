/*
 * 第一个方法是尾递归的形式，时间的复杂度为O(n)+O(n)
 * 第二个方法是迭代的形式，时间的复杂度为O(n)+O(1)
 * 在讲求效率的时候，应该将递归的形式改写为迭代的形式
 */
public class Factorial{
	static long factorial(int n){ //递归
		if(n < 0){
			System.exit(1) ;
		}
		if(n == 0){
			return 1 ;
		}else{
			return n*factorial(n-1) ;
		}
	}

	static long factorial2(int n){ //迭代
		if(n < 0){
			System.exit(1) ;
		}
		if(n == 0){
			return 1 ;
		}

		long fac = 1 ;
		while(n > 1){
			fac *= n-- ;
		}
		return fac ;
	}

	public static void main(String args[]){
		long fac = factorial(65) ;
		System.out.println(fac) ;
	}
}