public class TestStatic{
    public static void main(String args[]){
        StaticB b = new StaticB();
        System.out.println(b.id);
    }
}

class StaticA{
    static int id = 10;
}

class StaticB extends StaticA{
    public int id;
}
