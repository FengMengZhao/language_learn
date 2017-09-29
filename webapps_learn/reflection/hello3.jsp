<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8"/>
        <title>Hello JSP Page</title>
    </head>
    <body>
        <!-- 解决乱码 -->
        <% 
            request.setCharacterEncoding("UTF-8"); 
        %>
        <h1 align="center">This is hello jsp!</h1>
        <jsp:useBean id="userBean" scope="session" class="org.fmz.test.reflection.bean.User" />
        <jsp:setProperty name="userBean" property="id" />
        <jsp:setProperty name="userBean" property="name" />
        <jsp:setProperty name="userBean" property="birthdat" />
        <table border="1" align="center">
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

        <%
            int a = userBean.store();
            if(a ==1){
                out.println("储存成功!");
            }else{
                out.println("储存失败!");
            }
        %>
    </body>
</html>
