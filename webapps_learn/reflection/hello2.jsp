<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8"/>
        <title>Hello2 JSP Page</title>
    </head>
    <body>
        <!-- 解决乱码 -->
        <% 
            request.setCharacterEncoding("UTF-8"); 
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String birthdate = request.getParameter("birthdate");
        %>
        <h1 align="center">This is hello jsp!</h1>
        <table border="1" align="center">
            <thead>
                <tr><td>Form Value</td></tr>
            </thead>
            <tbody>
                <tr>
                    <td><%= id%></td>
                </tr>
                <tr>
                    <td><%= name%></td>
                </tr>
                </tr>
                <tr>
                    <td><%= birthdate%></td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
