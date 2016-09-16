public class WeiDianOutput{
    public static void main(String... args){
        System.out.println(WeiDianOutput.test());
    }
    public static int test(){
        int i = 1;
        try{
            return i++;
        }finally{
            if(i == 1){
                System.out.println("a");
                i = 10;
            }else if(i == 2){
                System.out.println("b");
                i = 15;
            }else
                System.out.println("c");
        }
    }
}
