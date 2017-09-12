public class TestWhile{
    public static void main(String args[]){
        int i = -1;
        while(i++ < args.length-1)
            if(args[i].equals("fmz"))
                System.out.println("fmz");
            else System.out.println("Not fmz");
            System.out.println("*****");
    }
}
