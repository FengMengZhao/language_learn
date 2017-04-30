public class TestReturn{
    public static int func(){
        try{
            return 1;
        }catch(Exception e){
            return 2;
        }finally{
            System.out.println(3);
        }
    }

    public static void main(String args[]){
        System.out.println(TestReturn.func());
    }
}
