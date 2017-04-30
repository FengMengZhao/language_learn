public class TestInitialization{
    public static void main(String args[]){
        System.out.println(TestA.s);
        System.out.println("######");
        System.out.println(TestB.s);
        System.out.println("######");
        System.out.println(new TestB().s);
    }
}

class TestA{
    public static final String s = "s";
    static{
        System.out.println("static TestA");
    }
    public TestA(){
        System.out.println("constructor TestA");
    }
}

class TestB extends TestA{
    static {
        System.out.println("static TestB");
    }

    public TestB(){
        System.out.println("constructor TestB");
    }
}
