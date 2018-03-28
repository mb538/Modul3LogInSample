package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import java.util.ArrayList;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    public static Order createOrder( int userid, int length, int width, int height ) throws LoginSampleException {
        Order order = new Order( userid, length, width, height);
        OrderMapper.createOrder( order );
        return order;
    }
    public static boolean updateOrder(Order o) throws ClassNotFoundException{
//        Order order = new Order ( o.getOrderid(), o.isShipped());
        return OrderMapper.updateOrder(o);   
    }
    public static boolean updateShipped(Order o) throws LoginSampleException{
//        Order order = new Order ( o.getOrderid(), o.isShipped());
        return OrderMapper.updateShipped(o);//////////////
    }
    public static boolean deleteOrder(int orderid){
        return OrderMapper.deleteOrder(orderid);
    }
    public static void updateUser(User user) throws LoginSampleException {
        UserMapper.updateUser( user );
    }
    public static Order getOrder(int userid) throws LoginSampleException{
        Order order = OrderMapper.getOrder(userid);
        return order;
    }
    public static ArrayList<Order> getOrders(int userid) throws LoginSampleException{
        ArrayList<Order> orders = OrderMapper.getOrders(userid);
        return orders;
    }
    public static ArrayList<Order> getAllOrders() throws LoginSampleException{
        ArrayList<Order> orders = OrderMapper.getAllOrders();
        return orders;
    }
    public static ArrayList<Order> getNotSentOrders() throws LoginSampleException{
        ArrayList<Order> orders = OrderMapper.getNotSentOrders();
        return orders;
    }
    public static ArrayList<Order> getSentOrders() throws LoginSampleException{
        ArrayList<Order> orders = OrderMapper.getSentOrders();
        return orders;
    }
}
