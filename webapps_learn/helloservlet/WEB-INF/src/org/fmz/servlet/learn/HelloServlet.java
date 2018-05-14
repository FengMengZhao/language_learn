package org.fmz.servlet.learn;
 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
 
@WebServlet("/servlet/sayHello")
public class HelloServlet extends HttpServlet {

    static {
        System.out.println("Instantiation static block");
    }
    
    @Override
    public void init(){
        System.out.println("##HelloServlet servlet inint.##");
    }

    public HelloServlet(){
        System.out.println("Instantiation constructor block");
    }

   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws IOException, ServletException {
      // Set the response message's MIME type
      response.setContentType("text/html;charset=UTF-8");
      // Allocate a output writer to write the response message into the network socket
      PrintWriter out = response.getWriter();
 
      // Write the response message, in an HTML page
      try {
         out.println("<!DOCTYPE html>");
         out.println("<html><head>");
         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
         out.println("<title>Hello, World</title></head>");
         out.println("<body>");
         out.println("<h1>Hello, world!</h1>");  // says Hello
         // Echo client's request information
         out.println("<p>Request URI: " + request.getRequestURI() + "</p>");
         out.println("<p>Protocol: " + request.getProtocol() + "</p>");
         out.println("<p>PathInfo: " + request.getPathInfo() + "</p>");
         out.println("<p>Remote Address: " + request.getRemoteAddr() + "</p>");
         // Generate a random number upon each request
         out.println("<p>A Random Number: <strong>" + Math.random() + "</strong></p>");
         out.println("</body>");
         out.println("</html>");
         out.println("ContestPath: <h3>" + request.getContextPath() + "</h3>");
         out.println("ServletPah: <h3>" + request.getServletPath() + "</h3>");
         out.println("PathInfo: <h3>" + request.getPathInfo() + "</h3>");
         out.println("RequestRUI: <h3>" + request.getRequestURI() + "</h3>");
         out.println("RealPath: <h3>" + request.getRealPath("/") + "</h3>");
      } finally {
         out.close();  // Always close the output writer
      }
   }
}
