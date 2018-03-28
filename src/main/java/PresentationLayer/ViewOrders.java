package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewOrders extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
       int id = (int) request.getSession().getAttribute("id");
       ArrayList<Order> orders = LogicFacade.getOrders(id);
       request.setAttribute("list", orders);
       return "vieworders";
    }
    
}
