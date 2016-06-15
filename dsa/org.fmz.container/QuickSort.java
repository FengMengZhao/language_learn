import java.util.* ;

public class QuickSort{
	public static void swap(int[] array, int first, int second){
		int temp = array[first] ;
		array[first] = array[second] ;
		array[second] = temp ;
	}

	static void medianOf3(int[] array, int left, int right){
		int middle = (left + right) >> 1 ;	

		if(array[left] > array[middle])
			swap(array, left, middle) ;

		if(array[middle] > array[right])
			swap(array, middle, right) ;

		if(array[left] > array[middle])
			swap(array, left, middle) ;
	}

	static int partition(int[] array, int left, int right){
		int middle = (left + right) >> 1 ;
		int pivot = array[middle] ;
		while(true){
			while(array[left++] < pivot) ;
			while(array[right--] > pivot) ;
			if(left < right)
				swap(array, left-1, right+1) ;
			else
				return left-1 ;
				
		}
	}

	public static void insertionSort(int[] array, int left, int right){
		int start = left ;
		if(left == right)
			return ;
		while(left < right){
			int insert_value = array[++left] ;
			int walker = left-1 ;
			while(walker >= start && array[walker] > insert_value){
				array[walker+1] = array[walker] ;
				walker -- ;
			}
			array[walker+1] = insert_value ;
		}
	}

	public static void quickSort(int[] array, int left, int right){
		if(right-left + 1 <= 10)
			insertionSort(array, left, right) ;
		else{
			medianOf3(array, left, right) ;
			int left_part = partition(array, left, right) ;
			quickSort(array, left, left_part-1) ;
			quickSort(array, left_part, right) ;
		}
	}

	public static void main(String args[]){
		Random rand = new Random(24) ;
		int[] array = new int[20] ;
		for(int i=0; i<array.length; i++)
			array[i] = rand.nextInt(10) ;

		quickSort(array, 0, array.length-1) ;

		for(int i : array){
			System.out.print(i + "\t") ;
		}
	}
}/* output
0	0	1	2	3	0	2	4	4	4	4	4	5	6	7	7	8	8	8	9	[Finished in 0.7s]
*/