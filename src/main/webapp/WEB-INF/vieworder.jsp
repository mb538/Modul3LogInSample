<%@page import="FunctionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Order</title>
    </head>
    <body>
        <% Order o = (Order) request.getAttribute("order"); %>
        <h1>View Order</h1>
        <div id="orderTable">   
            <table class="table">
                <tr>
                    <th>Order ID</th>
                    <th>User ID</th>
                    <th>Length</th>
                    <th>Width</th>
                    <th>Height</th>
                    <th>Shipped</th>
                </tr>   
                <tr>
                    <td> <%= o.getOrderid() %> </td>  
                    <td> <%= o.getUserid() %> </td>  
                    <td> <%= o.getLength() %> </td>
                    <td> <%= o.getWidth() %> </td>  
                    <td> <%= o.getHeight() %> </td>  
                    <td> <%= o.isSent() %> </td>                                    
                </tr> 
            </table>              
        </div>
        <form action="FrontController" method="post">
            <input type="hidden" name="command" value="togglesent">
            <input type="hidden" name="orderid" value="<%= o.getOrderid() %>">
            <input type="submit" value="Toggle Sent" class="button">
        </form>
            
        <form action="FrontController" method="post">
            <input type="hidden" name="command" value="deleteorder">
            <input type="hidden" name="orderid" value="<%= o.getOrderid() %>">
            <input type="submit" value="Delete Order" class="button" onclick="return confirm('Are you sure?')">
        </form>
            
        <a href="FrontController?command=viewcustomerorders">Back</a> 
    </body>
</html>
