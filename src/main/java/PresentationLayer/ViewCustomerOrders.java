package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewCustomerOrders extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
       ArrayList<Order> shipped = LogicFacade.getSentOrders();
       ArrayList<Order> notshipped = LogicFacade.getNotSentOrders();
       request.setAttribute("shippedorders", shipped);
       request.setAttribute("orders", notshipped);
       return "viewcustomerorders";
    }
    
}
