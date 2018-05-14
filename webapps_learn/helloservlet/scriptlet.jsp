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
        out.println("globalVariable: " + demvar++);
        int localDemvar = 0;
        out.println("localVariable: " + localDemvar++);
    %>
    <%!
    	public void jspInit(){
            System.out.println("This is the override jspInit() method!");
            System.out.println("This is the override jspInit() method!!!");
	    };
    %>
</body>
</body>
</html>
