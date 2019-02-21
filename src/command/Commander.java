package command;

import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import enums.Action;
import pooxy.Proxy;
import pooxy.RequestProxy;

public class Commander {

	public static Command order(Map<String,Proxy> pxy) {
		Command cmd = null;
		System.out.println("--------5--------");
		RequestProxy req = (RequestProxy)pxy.get("req");
		HttpServletRequest request = req.getRequest();
		System.out.println("cmd ==== : "+request.getParameter("cmd"));
		switch (Action.valueOf(request
				.getParameter("cmd")
				.toUpperCase())) {
		case MOVE:
			cmd = new Command(pxy);
			break;
		case REGISTER:
			cmd = new CreateCommand(pxy);
			break;
		case ACCESS:
			cmd = new ExistCommand(pxy);
			break;
		case SIGNUP:
			cmd = new CreateCommand(pxy);
			break;
		case SIGNIN:
			cmd = new ExistCommand(pxy);
			break;
		case CUSTOMER_LIST:
			cmd = new ListCommand(pxy);
			break;
		case CUST_RETRIEVE:
			cmd = new RetrieveCommand(pxy);
			break;
		case CUST_UPDATE:
			cmd = new UpdateCommand(pxy);
			break;
		case CUST_FILE_UPLOAD:
			cmd = new FileCommand(pxy);
			break;
		case CUST_REMOVE:
			cmd = new RemoveCommand(pxy);
			break;
		case PRO_REGISTER:
			cmd = new CreateCommand(pxy);
			break;
		case PRO_LIST:
			cmd = new ListCommand(pxy);
			break;
		case PRODUCT_RETRIEVE:
			cmd = new RetrieveCommand(pxy);
			break;
		default:
			break;
		}
		return cmd;
	}

}
