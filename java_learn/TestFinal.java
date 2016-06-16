import java.util.* ;

public class TestFinal{
    public static void main(String args[]){
        final int FMZ = 100 ;
        // FMZ = 200 ; // undo 
        final String[] CLL = {"fmz", "cll", "fsl"} ; // cant reassign the final variable CLL, but can modify the value
                                                     // reference refer to(a object, here is an array)  
        CLL[0] = "zhongguo" ;
        System.out.println(Arrays.toString(CLL)) ;
    }
}
