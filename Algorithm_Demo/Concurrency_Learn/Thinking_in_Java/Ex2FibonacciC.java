public class Ex2FibonacciC implements Runnable{
	private int n = 0 ;
	public Ex2FibonacciC(int n){
		this.n = n ;
	}

	private int fib(int x){
		if( x < 2){
			return 1 ;
		}
		return fib(x-1) + fib(x-2) ;
	}

	public void run(){
		for(int i=0; i<n; i++){
			System.out.print(fib(i) + " ");
			System.out.println();
			Thread.yield() ;
		}
	}
}