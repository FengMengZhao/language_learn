import java.util.Random;

public class TestCompileTimeConstant{
    public static void main(String args[]){
        System.out.println(CompileTimeConstant.id);
    }
}

class CompileTimeConstant{
    public static final int id;
    pubilc int id = 10;
    /*
    static {
        System.out.println("static block");
        id = 10;
    }
    */
}
