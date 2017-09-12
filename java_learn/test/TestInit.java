class SuperInit{
    public SuperInit(){
        System.out.println("SuperInit");
    }

    {
        System.out.println("I am SuperInit class");
    }

    static{
        System.out.println("static SuperInit");
    }

}
class ChildInit extends SuperInit{

    public ChildInit(){
        System.out.println("ChildInit");
    }

    {
        System.out.println("I am ChildInit class");
    }

    static{
        System.out.println("static ChildInit");
    }
}

public class TestInit{
    public static void main(String args[]){
        new ChildInit();
    }
}
