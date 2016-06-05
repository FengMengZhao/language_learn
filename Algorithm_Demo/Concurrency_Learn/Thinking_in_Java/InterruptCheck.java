public class InterruptCheck extends Thread{
	public void run(){
		System.out.println("start");
		while(true){
			if(Thread.currentThread().isInterrupted()){
				break ;
			}
		}
	}

	public static void main(String args[]){
		Thread thread = new InterruptCheck() ;
		thread.start() ;
		try{
			sleep(2000) ;
 		}catch(InterruptedException e){}
 		thread.interrupt() ;
	}
}
