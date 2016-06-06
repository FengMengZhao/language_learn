public class LifeOff implements Runnable{
	protected int count_down = 10 ;
	private static int task_count = 0 ;
	private final int id = task_count++ ;

	public LifeOff(){}

	public LifeOff(int count_down){
		this.count_down = count_down ;
	}

	public String status(){
		return "#" + id + "(" +
			(count_down > 0 ? count_down : "LifeOff!" ) + "), " ;
	}

	public void run(){
		while(count_down-- > 0){
			System.out.print(status()) ;
			Thread.yield() ;
		}
	}
}