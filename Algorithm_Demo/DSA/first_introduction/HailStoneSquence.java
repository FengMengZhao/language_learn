import java.util.* ;

public class HailStoneSquence{
	static List hailStoneSquence(int n){
		List list = new ArrayList() ;
		list.add(n) ;
		while(1 < n){
			n = (n % 2 != 0) ? 3*n+1 : n/2 ;
			list.add(n) ;
		}
		return list ;
	}

	public static void main(String args[]){
		for(int i=1;i<100;i++){
			List list = hailStoneSquence(i) ;
			System.out.println(list) ;
		}
	}
}