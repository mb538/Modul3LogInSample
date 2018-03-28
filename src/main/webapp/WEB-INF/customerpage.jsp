<%-- 
    Document   : customerpage
    Created on : Aug 22, 2017, 2:33:37 PM
    Author     : kasper
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <h1>Hello <%=request.getParameter( "email" )%> </h1>
        <a href="FrontController?command=createorderlink">New Order</a> 
        <a href="FrontController?command=vieworders">View Orders</a>
        
        <form action="Logout" method="post" class="button">
        <input type="submit" value="Log Out">
        </form>  
    </body>
</html>
