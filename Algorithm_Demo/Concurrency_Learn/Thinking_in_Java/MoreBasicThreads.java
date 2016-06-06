public class MoreBasicThreads{
	public static void main(String args[]){
		for(int i=0; i<500000; i++){
			new Thread(new LifeOff()).start() ;
			System.out.println("Waiting for LifeOff...") ;
		}
	}
}