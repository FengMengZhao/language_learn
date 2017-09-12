import java.util.Arrays;

public class TestArrayCopy{
    public static void main(String args[]){
        Integer[] arr = new Integer[]{Integer.valueOf(1), 
                                      Integer.valueOf(2), 
                                      Integer.valueOf(3),
                                      Integer.valueOf(4), 
                                      Integer.valueOf(5),
                                      Integer.valueOf(6), 
                                      Integer.valueOf(7)};

        System.out.println(Arrays.asList(Arrays.copyOf(arr, 14)));
    }
}

