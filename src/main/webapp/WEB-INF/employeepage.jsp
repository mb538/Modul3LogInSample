<%-- 
    Document   : employeepage.jsp
    Created on : Aug 24, 2017, 6:31:57 AM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee home page</title>
    </head>
    <body>
        <a href="FrontController?command=viewcustomerorders">View Customer Orders</a> 
        <h1>Hello <%=request.getParameter("email")%> </h1>
        
        <form action="Logout" method="post" class="button">
        <input type="submit" value="Log Out">
    </form>  
    </body>
</html>
