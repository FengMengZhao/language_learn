<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8"/>
</head>
<body>
<h2>利用嵌入java代码的方法</h2>
<%
String name = request.getParameter("username");
//默认的URI解码方式要在server.xml中配置，默认为ISO-8859-1
//String name1 = new String(name.getBytes("ISO-8859-1"), "UTF-8");
out.print("welcome " + name + "<br />");
%>
<h2>利用嵌入EL的方法</h2>
welcome ${param.username}
<h3><%=request.getContextPath()%></h3>
<h3><%=request.getServletPath()%></h3>
<h3><%=request.getRequestURI()%></h3>
<h3><%=request.getRealPath("/")%></h3>
<h3>test the encoding!</h3>
</body>
</html>
