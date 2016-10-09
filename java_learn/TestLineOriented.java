import java.io.*;

public class TestLineOriented{
    public static void main(String args[])throws Exception{
        BufferedReader in = new BufferedReader(new FileReader("in.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("out.txt"));

        String s;
        while((s = in.readLine()) != null)
            out.println(s);

        if(in != null)
            in.close();
        if(out != null)
            out.close();
    }
}
