public class TestRun{
    public static void main(String args[]){
        Thread t = new Thread(new Runnable(){
            public void run(){
                pong();
            }
        });

        t.run();
        System.out.println("ping");
    }

    static void pong(){
        System.out.println("pong");
    }
}
