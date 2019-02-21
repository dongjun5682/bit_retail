package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import pooxy.Proxy;
import pooxy.RequestProxy;
import service.CustomerServiceImpl;

public class RemoveCommand extends Command{

	public RemoveCommand(Map<String, Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy)pxy.get("req");
		HttpServletRequest request = req.getRequest();
		CustomerDTO cust = new CustomerDTO();
		cust.setCustomerId(request.getParameter("customer_Id"));
		CustomerServiceImpl.getInstance().removeCustomer(cust);
	}
}
