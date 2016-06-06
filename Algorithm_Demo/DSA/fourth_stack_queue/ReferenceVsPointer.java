public class ReferenceVsPointer{
	public static void changeInt(int a){
		a = -1 ;
	}
	public static void changeString(StringBuffer b){
		b.append('!').append('!') ;
	}
	public static void changeObject(int[] array){
		array[0] = 0 ;
	}
	public static void main(String args[]){
		int a = 10 ;
		changeInt(a) ;
		System.out.println(a) ;
		StringBuffer sb = new StringBuffer("cll") ;	
		changeString(sb) ;
		System.out.println(sb) ;
		int[] array = {1} ;
		System.out.println(array[0]) ;
		changeObject(array) ;
		System.out.println(array[0]) ;
		System.out.println(a) ;
		System.out.println(array) ;
	}
}