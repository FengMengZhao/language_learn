//import java.io.File;
//import java.util.Date;
public class Sample
{
    Date d; 
    public static void main(String[] args) throws Exception
    {
        System.out.println("*");
        Class.forName("java.util.LinkedHashSet");
        String fileName = "sample";
        File file = new File(fileName);
        System.out.println("*" + file.isFile());
    }
} 
