public class TestPrintPolymorphism{
    public static void main(String args[]){
        PrintB pb = new PrintB();
        pb.printA();
    }
}

class PrintA{
    public void printA(){
        print();
    }

    public void print(){
        System.out.println("A");
    }
}

class PrintB extends PrintA{
    public void print(){
        System.out.println("B");
    }
}
