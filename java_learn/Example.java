public class Example{
    private int i = giveMeJ();
    private int j = 10;
    private int giveMeJ(){
        return j;
    }
    public static void main(String args[]){
        System.out.println(new Example().i);
    }
}
