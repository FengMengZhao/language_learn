import java.io.*;

public class TestCharacterStream{
    public static void main(String args[])throws Exception{
        FileReader in = new FileReader("in.txt");
        FileWriter out = new FileWriter("out.txt");

        int c;
        while((c = in.read()) != -1){
            System.out.print(c + ", ");
            out.write(c);
        }

        if(in != null)
            in.close();
        if(out != null)
            out.close();
    }
}
