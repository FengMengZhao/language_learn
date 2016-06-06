public class Ex2{
	public static void main(String args[]){
		Thread ta = new Thread(new Ex2FibonacciA(14)) ;
		Thread tb = new Thread(new Ex2FibonacciB(14)) ;
		Thread tc = new Thread(new Ex2FibonacciC(14)) ;
		Thread td = new Thread(new Ex2FibonacciD(14)) ;

		ta.start() ;
		tb.start() ;
		tc.start() ;
		td.start() ;
	}
}