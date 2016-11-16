public class TestStatic{
    public static void main(String args[]){
        System.out.println(Child.id);
    }
}

class Super{
    public static int id = 10;
    static{
        id = 10000;
        System.out.println("Super static init block");
    }
}

class Father extends Super{
    public static int id = 100;
    static{
        id = 1000;
        System.out.println("Father static init block");
    }
}

class Child extends Father{
    static{
        System.out.println("Child static init block");
    }
}
