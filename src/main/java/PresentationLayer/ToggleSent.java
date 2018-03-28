package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ToggleSent extends Command{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
       int orderid = Integer.parseInt(request.getParameter( "orderid" ));
       Order order = LogicFacade.getOrder(orderid);
       if(order.isSent() == true){
           order.setSent(false);
       }
       else if (order.isSent() == false){
           order.setSent(true);
       }
       LogicFacade.updateShipped(order);
       request.setAttribute("order", order);
       return "vieworder";
    }
    
}
