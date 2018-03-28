package PresentationLayer;

import FunctionLayer.LoginSampleException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "register", new Register() );
        commands.put( "createorderlink", new CreateOrderLink() );
        commands.put( "createorder", new CreateOrder() );
        commands.put( "rolepage", new RolePage() );
        commands.put( "vieworders", new ViewOrders() );
        commands.put( "viewcustomerorders", new ViewCustomerOrders() );
        commands.put( "searchorder", new SearchOrder() );
        commands.put( "togglesent", new ToggleSent() );
        commands.put( "deleteorder", new DeleteOrder() );
    }

    static Command from( HttpServletRequest request ) {
        String commandName = request.getParameter( "command" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand() );
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response ) 
            throws LoginSampleException;

}
