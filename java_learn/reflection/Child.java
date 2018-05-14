public class Child extends Father{
    public void sayWord(){
        System.out.println("Child");
    }

    public static void main(String args[]){
        Father f = new Child();
        f.sayWord();
    }
}
