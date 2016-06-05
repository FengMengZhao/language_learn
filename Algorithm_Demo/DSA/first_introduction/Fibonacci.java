public class Fibonacci{
	private int n ;
	public Fibonacci(int n){
		this.n = n ;
	}
	int fib(int x){
		if(x < 2){
			return 1 ;
		}
		return fib(x-1) + fib(x-2) ;
	}

	public void printSquence(){
		for(int i=0; i<n; i++){
			System.out.print(fib(i) + " ") ;
		}
	}

	public static void main(String args[]){
		Fibonacci f = new Fibonacci(39) ;
		f.printSquence() ;
	}
}/* output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 3524578 5702887 9227465 14930352 24157817 39088169 63245986 [Finished in 1.0s]
*/