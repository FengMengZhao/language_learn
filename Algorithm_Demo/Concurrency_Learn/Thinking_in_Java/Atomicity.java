import java.util.concurrent.atomic.AtomicInteger ;

public class Atomicity{
	private static volatile int none_atomic_counter = 0 ;
	private static volatile AtomicInteger atomic_counter = new AtomicInteger(0) ;
	private static int times = 0 ;

	public static void caculate(){
		times ++ ;
		for(int i=0; i<1000; i++){
			new Thread(new Runnable(){
				public void run(){
					none_atomic_counter ++ ;
					atomic_counter.incrementAndGet() ;
				}
			}).start();
		}

		try{
			Thread.sleep(1000) ;
		}catch(InterruptedException e){}
	}

	public static void main(String args[]){
		caculate() ;
		while(none_atomic_counter == 1000){
			none_atomic_counter = 0 ;
			atomic_counter.set(0) ;
			caculate() ;
		}

		System.out.println("Non-atomic counter: " + times + ":" + none_atomic_counter) ;
		System.out.println("Atomic counter: " + times + ":" + atomic_counter) ;
	}
}/* output:
Non-atomic counter: 1021:999
Atomic counter: 1021:1000
[Finished in 1127.8s]
*/