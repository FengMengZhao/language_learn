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
out.print("welcome" + name);
%>
<h2>利用嵌入EL的方法</h2>
welcome${param.username}
</body>
</html>
