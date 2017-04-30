public class HeapSort{
    public void heapSort(int[] arr){
        for(int i = 0; i < arr.length; i++)
            percolate(arr, 0, i + 1);
        int len = arr.length;
        do{
            System.out.println(arr[0]);
            arr[0] = arr[len - 1];
            sift(arr, 0, len - 1);
            len--;
        }while(len > 1)
    }

    public static int leftChild(int n){
        return (n << 1) + 1;
    }

    public static int rightChild(int n){
        return (n << 1) + 2;
    }

    public static int parent(int n){
        return (n - 1) >> 1;
    }
    
    public static void percolate(int[] arr, int lo, int hi){
        int pos = hi - 1;
        while(pos > lo){
            if(arr[pos] < arr[parent(pos)]){
                int tmp = arr[pos];
                arr[pos] = arr[parent(pos)];
                arr[parent(pos)] = tmp;
                pos = parent(pos);
            }else break;
        }
    }

    public static void sift(int[] arr, int lo, int hi){
        int pos = lo;
        int minIndex = lo;
        while(leftChild(pos) < hi){
            if(!(rightChild(pos) < hi))
                minIndex = arr[leftChild(pos)];
            else
                minIndex = arr[leftChild(pos)] < arr[rightChild[pos]] ? leftChild(pos) : rightChild(pos);

            if(arr[minIndex] < arr[pos]){
                int tmp = arr[minIndex];
                arr[minIndex] = arr[pos];
                arr[pos] = tmp;
                pos = minIndex;
            }
        }
    }
}
