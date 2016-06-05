public class BasicThreads{
	public static void main(String args[]){
		Thread t = new Thread(new LifeOff()) ;
		t.start() ;
		System.out.println("Waiting for LifeOff...") ;
	}
}