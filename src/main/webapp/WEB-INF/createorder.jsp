<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Order</title>
    </head>
    <body>
        <h1>New Order</h1>
        
        <h2>CREATE ORDER</h2>
        
        <form action="FrontController" method="post" id="createOrder">
            <input type="hidden" name="command" value="createorder">
            <input type="hidden" name="userid" value ="<%= session.getAttribute("id")%>" />
            <input type="number" name="length" placeholder="Length" min="1" max="2000" required />
            <input type="number" name="width" placeholder="Width" min="1" max="2000" required />
            <input type="number" name="height" placeholder="Height" min="1" max="2000" required />
            <input type="submit" value="CREATE ORDER" class="button" />
        </form>
            <a href="FrontController?command=rolepage">Back</a> 
    </body>
</html>
