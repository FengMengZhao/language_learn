import java.util.* ;

public class VectorTest{
	public static void main(String args[]){
		Stack<Integer> sta = new Stack<Integer>() ;

		sta.push(1) ;
		sta.push(2) ;
		sta.push(3) ;
		sta.push(4) ;

		System.out.println(sta) ;
		System.out.println(sta.get(2)) ;
	}
}