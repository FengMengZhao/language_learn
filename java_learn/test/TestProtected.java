public class TestProtected extends ProtectedA{
    public int a;

    public void print(){
        System.out.println("base");
    }
    public static void main(String args[]){
        System.out.println(new TestProtected().a);
    }
}

class ProtectedA{
    void print(){
        System.out.println("base");
    }
    private int a = 4;
}
