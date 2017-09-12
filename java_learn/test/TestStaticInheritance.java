public class TestStaticInheritance{
    public int $$_$$ = 0;
    public static void main(String args[]){
        InheritanceB.method();
    }
}

class InheritanceA{
    public static void method(){
        System.out.println("static A");
    }
}

class InheritanceB extends InheritanceA{
    public static void method(){
        System.out.println("static B");
    }
}
