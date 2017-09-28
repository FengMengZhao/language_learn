class SuperClass{

    protected int num = 10;
}

public class InheritPrivate extends SuperClass{

    public static void main(String args[]){
        InheritPrivate sc = new InheritPrivate();
        System.out.println(sc.num);
    }
}
