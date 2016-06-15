import java.util.* ;

public class ShellSort{

	public static void shellSort(int[] array){
		int inner,
			outer,
			target ;
		int h = 1 ;
		while(h <= array.length)
			h = h*3 + 1 ;

		while(h > 0){
			for(outer = h; outer < array.length; outer++){
				target = array[outer] ;
				inner = outer ;
				while(inner > h-1 && array[inner-h] > target){
					array[inner] = array[inner-h] ;
					inner -= h ;
				}
				array[inner] = target ;
			}
			h = (h-1) / 3 ;
		}
	}

	public static void main(String args[]){
		Random rand = new Random(24) ;
		int[] array = new int[20] ;
		for(int i=0; i<array.length; i++)
			array[i] = rand.nextInt(10) ;
		shellSort(array) ;

		for(int i : array){
			System.out.print(i + "\t") ;
		}
	}
}/* output
0	0	0	1	2	2	3	4	4	4	4	4	5	6	7	7	8	8	8	9	[Finished in 0.6s]
*/