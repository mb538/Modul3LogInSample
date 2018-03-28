package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderMapper {
    
    public static void createOrder(Order o) throws LoginSampleException{
        try {
            Connection con = Connector.connection();
            
            String SQL = "INSERT INTO orders VALUES(null, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL );
            
            ps.setInt(1, o.getUserid());
            ps.setInt(2, o.getLength());
            ps.setInt(3, o.getWidth());
            ps.setInt(4, o.getHeight());
            ps.setBoolean(5, false);
            
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
//            ex.printStackTrace();
            throw new LoginSampleException( "Could not validate order" );
        }
    }
    
    public static boolean updateOrder(Order o) throws ClassNotFoundException{
        try
        {
        Connection con = Connector.connection();
        
        String SQL = "UPDATE orders SET length = ?, width = ?, height = ?, sent = ? WHERE orderid = ?";
            PreparedStatement ps = con.prepareStatement( SQL );
            
            ps.setInt(1, o.getLength());
            ps.setInt(2, o.getWidth());
            ps.setInt(3, o.getHeight());
            ps.setBoolean(4, o.isSent());
            ps.setInt(5, o.getOrderid());
            ps.executeUpdate();
            
            return true;
        } catch (SQLException | ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    public static boolean updateShipped(Order o) throws LoginSampleException{
        try
        {
        Connection con = Connector.connection();
        
        String SQL = "UPDATE orders SET sent = ? WHERE orderid = ?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setBoolean(1, o.isSent());
            ps.setInt(2, o.getOrderid());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    
    public static boolean deleteOrder(int orderid){
        try
        {
        Connection con = Connector.connection();
        
        String SQL = "DELETE FROM orders WHERE orderid = ?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setInt(1, orderid);  
            ps.executeUpdate();

            return true;
            } catch (SQLException | ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    public static Order getOrder(int orderid) throws LoginSampleException{
        try
        {
            Connection con = Connector.connection();
            
            String SQL = "SELECT * FROM orders WHERE orderid = ?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setInt(1, orderid);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next())
            {
                int userid = rs.getInt("userid");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                boolean sent = rs.getBoolean("sent");

                return new Order(orderid, userid, length, width, height, sent);
            }
        }
        catch (SQLException | ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        return null;
    }
    public static ArrayList<Order> getOrders(int userid) throws LoginSampleException{
        ArrayList<Order> orders = new ArrayList();
        try {
        Connection con = Connector.connection();
            
        String SQL = "SELECT * FROM orders WHERE userid = ?";
        PreparedStatement ps = con.prepareStatement( SQL );
        ps.setInt(1, userid);
        ResultSet rs = ps.executeQuery();
            
            while (rs.next())
            {
                int orderid = rs.getInt("orderid");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                boolean sent = rs.getBoolean("sent");

                Order o = new Order(orderid, userid, length, width, height, sent);

                orders.add(o);
            }
        }catch(SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return orders;
    }
    public static ArrayList<Order> getAllOrders() throws LoginSampleException{
        ArrayList<Order> orders = new ArrayList();
        try{
        Connection con = Connector.connection();
            
        String SQL = "SELECT * FROM orders";
        PreparedStatement ps = con.prepareStatement( SQL );
        ResultSet rs = ps.executeQuery();
            
            while (rs.next())
            {
                int orderid = rs.getInt("orderid");
                int userid = rs.getInt("userid");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                boolean sent = rs.getBoolean("sent");

                Order o = new Order(orderid, userid, length, width, height, sent);

                orders.add(o);
            }
        }catch(SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return orders;
    }
    public static ArrayList<Order> getNotSentOrders() throws LoginSampleException{
        ArrayList<Order> orders = new ArrayList();
        try{
        Connection con = Connector.connection();
            
        String SQL = "SELECT * FROM orders WHERE sent = ?";
        PreparedStatement ps = con.prepareStatement( SQL );
        ps.setBoolean(1, false);
        ResultSet rs = ps.executeQuery();
            
            while (rs.next())
            {
                int orderid = rs.getInt("orderid");
                int userid = rs.getInt("userid");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                boolean sent = rs.getBoolean("sent");

                Order o = new Order(orderid, userid, length, width, height, sent);

                orders.add(o);
            }
        }catch(SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return orders;
    }
    public static ArrayList<Order> getSentOrders() throws LoginSampleException{
        ArrayList<Order> orders = new ArrayList();
        try{
        Connection con = Connector.connection();
            
        String SQL = "SELECT * FROM orders WHERE sent = ?";
        PreparedStatement ps = con.prepareStatement( SQL );
        ps.setBoolean(1, true);
        ResultSet rs = ps.executeQuery();
            
            while (rs.next())
            {
                int orderid = rs.getInt("orderid");
                int userid = rs.getInt("userid");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                boolean sent = rs.getBoolean("sent");

                Order o = new Order(orderid, userid, length, width, height, sent);

                orders.add(o);
            }
        }catch(SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return orders;
    }
}
