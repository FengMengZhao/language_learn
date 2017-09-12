class BasiClass{
    private void f(){
        System.out.println("My name is secret");
    }
}

public class TestFakePolymorphism extends BasiClass{
    public void f(){
        System.out.println("My name is fmz");
    }

    public static void main(String args[]){
        BasiClass b = new TestFakePolymorphism();
        b.f();
    }
}

