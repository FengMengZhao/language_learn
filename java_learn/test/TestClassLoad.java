class ClassLoad{
    public static final int a = 0;
    static {
        System.out.println("static block");
        System.out.println(a);
    }
    {
        //a = 5;
        System.out.println("instance init");
    }
    public ClassLoad(){
        System.out.println("constructor");
    }
}

public class TestClassLoad{
    public static void main(String args[]){
        try{
            //Class.forName("ClassLoad");
            //new ClassLoad();
            System.out.println(ClassLoad.a);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
