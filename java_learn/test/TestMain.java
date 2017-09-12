import java.util.*;

public class TestMain extends BaseMain{
    static final int a = new Random().nextInt();
    //static final int a = 10;
    static{
        System.out.println("static init block");
    }

    {
        System.out.println("instance init block");
    }

    public TestMain(){
        System.out.println("constructor");
    }
    public static void main(String args[]){
        System.out.println(TestMain.a);
    }
}

class BaseMain{
    static {
        System.out.println("base static init block");
    }

    {
        System.out.println("base instance init block");
    }

    public BaseMain(){
        System.out.println("base constructor");
    }
}
