<%-- 
    Document   : index
    Created on : Aug 22, 2017, 2:01:06 PM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome page</title>
    </head>
    <body>
        <h1>Welcome to Sem 2</h1>
        <h1>${logout}</h1>
        <table>
            <tr><td>Login</td>
                <td>
                    <form name="login" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="login">
                        Email:<br>
                        <input type="text" name="email" pattern=".{3,20}" title="The password you entered is too long">
                        <br>
                        Password:<br>
                        <input type="password" name="password" pattern=".{3,20}" title="The password you entered is too long">
                        <br>
                        <input type="submit" value="Submit">
                    </form>
                </td>
                <td>Or Register</td>
                <td>
                    <form name="register" action="FrontController" method="POST">
                        <input type="hidden" name="command" value="register">
                        Email:<br>
                        <input type="text" name="email" pattern=".{3,20}" title="Please enter an email between 3 and 20 characters" required>
                        <br>
                        Password:<br>
                        <input type="password" name="password1" pattern=".{3,20}" title="Please enter a password between 3 and 20 characters" required>
                        <br>
                        Retype Password:<br>
                        <input type="password" name="password2" pattern=".{3,20}" title="Please enter a password between 3 and 20 characters" required>
                        <br>
                        <input type="submit" value="Submit">
                    </form>
                </td>
            </tr>
        </table>
        <% String error = (String) request.getAttribute( "error");
           if ( error != null) { %>
           <H2>Error!!</h2>
           <p><%= error %>
        <% }
        %>
    </body>
</html>
