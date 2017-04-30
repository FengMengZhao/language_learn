public class TestFinally{
    public static void main(String args[]){
        System.out.println(test());
    }

    public static int test(){
        int b = 20;
        try{
            System.out.println("try block");
            return b += 80;
        }catch(Exception e){
            System.out.println("catch block");
        }finally{
            System.out.println("finally block");
            if(b > 20)
                System.out.println("b > 20, b = " + b);
        }
        return b;
    }
}
