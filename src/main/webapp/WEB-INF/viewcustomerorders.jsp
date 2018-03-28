<%-- 
    Document   : viewcustomerorders
    Created on : 22-03-2018, 14:30:02
    Author     : Mads
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.Order"%>
<%@page import="FunctionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Orders</title>
    </head>
    <body>
        <% List<Order> shippedorders = (ArrayList<Order>) request.getAttribute("shippedorders");%>
        <% List<Order> orders = (ArrayList<Order>) request.getAttribute("orders");%>
        <h1>Search Order</h1>
        
        <form action="FrontController" method="post" id="formSearch">
            <input type="hidden" name="command" value="searchorder">
            <input type="number" name="orderid" placeholder="orderid" required>
            <input type="submit" value="SEARCH ORDER" class="button">
        </form>
        
        <h1>Orders not yet shipped</h1>
        
        <div id="orderTable">   
            <table class="table">
                <tr>
                    <th>Order ID</th>
                    <th>User ID</th>
                    <th>Length</th>
                    <th>Width</th>
                    <th>Height</th>
                    <th>Sent</th>
                </tr>
                
                 <%
                for(Order o : orders)
                { %>
                    <tr>
                    <td> <%= o.getOrderid() %> </td>  
                    <td> <%= o.getUserid() %> </td>  
                    <td> <%= o.getLength() %> </td>
                    <td> <%= o.getWidth() %> </td>  
                    <td> <%= o.getHeight() %> </td>  
                    <td> <%= o.isSent() %> </td>                                    
                </tr> 
                <% } %>
            </table>              
        </div>
            
         <h1>Shipped Orders</h1>
         
         <div id="orderTable">   
            <table class="table">
                <tr>
                    <th>Order ID</th>
                    <th>User ID</th>
                    <th>Length</th>
                    <th>Width</th>
                    <th>Height</th>
                    <th>Sent</th>
                </tr>
                
                 <%
                for(Order o : shippedorders)
                { %>
                    <tr>
                    <td> <%= o.getOrderid() %> </td>  
                    <td> <%= o.getUserid() %> </td>  
                    <td> <%= o.getLength() %> </td>
                    <td> <%= o.getWidth() %> </td>  
                    <td> <%= o.getHeight() %> </td>  
                    <td> <%= o.isSent() %> </td>                                    
                </tr> 
                <% } %>
            </table>              
        </div>
            
        <a href="FrontController?command=rolepage">Back</a> 
    </body>
</html>
