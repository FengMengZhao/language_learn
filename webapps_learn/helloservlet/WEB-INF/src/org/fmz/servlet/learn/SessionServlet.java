package org.fmz.servlet.learn;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Date;
import javax.servlet.annotation.WebServlet;

@WebServlet("/servlet/sessionTest")
public class SessionServlet extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Return the existing session if there is one. Create a new session otherwise
        HttpSession session = request.getSession();
        Integer accessCount;

        synchronized(session){
            accessCount = (Integer)session.getAttribute("accessCount");
            if(accessCount == null){
                accessCount = 0;
            }else{
                accessCount = new Integer(accessCount + 1);
            }
            session.setAttribute("accessCount", accessCount);
        }

        // Write the response message, in an html page
        try{
             out.println("<!DOCTYPE html>");
             out.println("<html>");
             out.println("<head><meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
             out.println("<title>Session Test Servlet</title></head><body>");
             out.println("<h2>You have access this site " + accessCount + " times in this session.</h2>");
             out.println("<p>(Session ID is " + session.getId() + ")</p>");
     
             out.println("<p>(Session creation time is " +
                   new Date(session.getCreationTime()) + ")</p>");
             out.println("<p>(Session last access time is " +
                   new Date(session.getLastAccessedTime()) + ")</p>");
             out.println("<p>(Session max inactive interval  is " +
                   session.getMaxInactiveInterval() + " seconds)</p>");
     
             out.println("<p><a  href='" + request.getRequestURI() +  "'>Refresh</a>");
             out.println("<p><a  href='" + response.encodeURL(request.getRequestURI())  +
                         "'>Refresh with  URL rewriting</a>");
             out.println("</body></html>");
          } finally {
             out.close();  // Always close the output writer
          }
    }
}
