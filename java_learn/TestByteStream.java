import java.io.*;

public class TestByteStream{
    public static void main(String args[])throws Exception{
        FileInputStream in = new FileInputStream("in.txt");
        FileOutputStream out = new FileOutputStream("out.txt");

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
