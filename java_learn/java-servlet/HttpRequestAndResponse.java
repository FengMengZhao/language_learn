import java.net.*;
import java.io.*;

public class HttpRequestAndResponse{

    public static void main(String args[]) throws Exception{
        String urlString = "http://www.baidu.com";
        URL url = new URL(urlString);
        HttpURLConnection c = (HttpURLConnection)url.openConnection();  //connecting to url
        c.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));  //stream to resource
        String str;
        String responsestring = "";
        while ((str = in.readLine()) != null)   //reading data
               responsestring += str+"\n";//process the response and save it in some string or so
        in.close();  //closing stream
        //response.getWriter().write(responsestring);
        System.out.println(responsestring);
    }
}
