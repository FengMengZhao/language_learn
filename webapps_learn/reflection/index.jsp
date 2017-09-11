<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8"/>
        <title>JSP page</title>
    </head>
    <body>
        <h1 align="center">Student Form</h1>
        <form action="hello.jsp" method="post">
            <table border="1" align="center">
                <tbody>
                    <tr>
                        <td>Student Id</td>
                        <td><input type="text" name="id" value="001"/></td>
                    </tr>
                    <tr>
                        <td>Student Name</td>
                        <td><input type="text" name="name" value="冯孟昭"/></td>
                    </tr>
                    <tr>
                        <td>Student Birthday</td>
                        <td><input type="string" name="birthdate" value="1990-07-19"/></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="submit" /></td>
                    </tr>
                </tbody>
            </table>
        </form> 
        <form action="hello2.jsp" method="post">
            <table border="1" align="center">
                <tbody>
                    <tr>
                        <td>Student Id</td>
                        <td><input type="text" name="id" value="001"/></td>
                    </tr>
                    <tr>
                        <td>Student Name</td>
                        <td><input type="text" name="name" value="冯孟昭"/></td>
                    </tr>
                    <tr>
                        <td>Student Birthday</td>
                        <td><input type="string" name="birthdate" value="1990-07-19"/></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="submit" /></td>
                    </tr>
                </tbody>
            </table>
        </form> 
    </body>

</html>
