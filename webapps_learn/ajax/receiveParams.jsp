<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<% 
        //接收参数 
        String userinput = request.getParameter("userinput"); 
        //控制台输出表单数据看看 
        System.out.println("userinput =" + userinput); 
        //检查code的合法性 
        if (userinput == null || userinput.trim().length() == 0) { 
                out.println("code can't be null or empty"); 
        } else if (userinput != null && userinput.equals("admin")) { 
                out.println("code can't be admin"); 
        } else { 
                out.println("OK");
        } 
%>
