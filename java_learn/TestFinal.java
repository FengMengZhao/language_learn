import java.util.* ;

public class TestFinal{
    static final List<Integer> ls = new ArrayList<>();
    public TestFinal(){
        ls = new ArrayList<>();
        ls.add(2);
        ls.add(2);

    }
    // not allowed
    /*
    public void set(List<Integer> ls){
        this.ls = ls;
    }
    */
    public void add(Integer i){
        ls.add(i);
    }
    public static void main(String args[]){
    }
}
