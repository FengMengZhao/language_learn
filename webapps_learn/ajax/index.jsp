<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8"/>
<%!
    int demvar = 0;
%>
</head>
<body>
    count is:
    <%
        out.println(demvar++);
    %>
</body>
</html>
