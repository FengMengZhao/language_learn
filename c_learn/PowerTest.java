public class PowerTest{
        public static int power(int base, int n){
                int result ;
                for(result=1; n>0; --n)
                        result = result * base ;
                return result ;
        }

        public static void main(String args[]){
                System.out.println(power(2, 10)) ;
        }
}
