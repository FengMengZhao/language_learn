class SuperInit{
    int i = 1;
    int j = 2;
    SuperInit(int i, int j){
        System.out.println(this.i);
        this.i = i;
        System.out.println(this.i);
        this.j = j;
    }
}
public class TestInit extends SuperInit{
    TestInit(int i, int j){
        super(i, j);
    }
    public static void main(String args[]){
        new TestInit(3, 4);
    }
}

