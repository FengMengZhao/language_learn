<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8"/>
        <title>getBeanProperty JSP Page</title>
    </head>
    <body>
        <!-- 解决乱码 -->
        <% 
            request.setCharacterEncoding("UTF-8"); 
        %>
        <h1 align="center">This is getBeanProperty jsp!</h1>
        <jsp:useBean id="userBean" scope="session" class="org.fmz.test.reflection.bean.User" />
        <table border="2" align="center">
            <thead>
                <tr><td>Form Value</td></tr>
            </thead>
            <tbody>
                <tr>
                    <td><jsp:getProperty name="userBean" property="id" /></td>
                </tr>
                <tr>
                    <td><jsp:getProperty name="userBean" property="name" /></td>
                </tr>
                <tr>
                    <td><jsp:getProperty name="userBean" property="birthdate" /></td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
