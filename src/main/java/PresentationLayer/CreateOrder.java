/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.Order;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mads
 */
public class CreateOrder extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        int userid = Integer.parseInt(request.getParameter( "userid" ));
        int length = Integer.parseInt(request.getParameter( "length" ));
        int width = Integer.parseInt(request.getParameter( "width" ));
        int height = Integer.parseInt(request.getParameter( "height" ));
        
        LogicFacade.createOrder( userid, length, width, height );
        
        int id = (int) request.getSession().getAttribute("id");
        ArrayList<Order> orders = LogicFacade.getOrders(id);
        request.setAttribute("list", orders);
       
        return "vieworders";
    }
    
}
