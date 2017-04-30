public class Child extends Father{
    private String name = "孩子";
    @Override
    public String getName(){
        return name;
    }
    public static void main(String args[]){
        Father c = new Father();
        System.out.println(c.getName());
    }
}

class Father {
    private String name = "父亲";
    public String getName(){
        return name;
    }
}
