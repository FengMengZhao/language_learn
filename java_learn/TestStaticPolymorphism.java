class A{}

class B extends A{}

class C extends B{}

public class TestStaticPolymorphism{
    public static void test(A a){
        System.out.println("Class A");
    }
    public static void test(B b){
        System.out.println("Class B");
    }

    public static void main(String args[]){
        A a = new A();
        test(a);
        B b = new B();
        test(b);
        A c = new C();
        test(c);
    }
}
