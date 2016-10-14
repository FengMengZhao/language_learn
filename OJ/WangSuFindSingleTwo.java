public class WangSuFindSingleTwo{
    public int[] findSingleTwo(int[] arr){
        int sum = 0;
        for(int i : arr)
            sum ^= i;
        int i = 0;
        while(i < Integer.toString(sum).length()){
            if((sum >> i & 1) == 1)
                break;
            i++;
        }
        System.out.println(i);

        int sum1 = 0,
            sum2 = 0;
        for(int j = 0; j < arr.length; j++){
            if((arr[j] >> i & 1) == 0)
                sum1 ^= arr[j];
            else    
                sum2 ^= arr[j];
        }
        return new int[]{sum1, sum2};
    }

    public static void main(String args[]){
        int[] res = new WangSuFindSingleTwo().findSingleTwo(new int[]{1, 7, 3, 3, 2, 2});
        System.out.println(res[0] + " " + res[1]);
    }
}
