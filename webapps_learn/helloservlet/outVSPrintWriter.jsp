<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8"/>
</head>
<body>
first
<% out.println("second"); %>
<% response.getWriter().println("third"); %>
</body>
</html>
