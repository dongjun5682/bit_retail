package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import pooxy.Proxy;
import pooxy.RequestProxy;
import service.CustomerServiceImpl;

public class UpdateCommand extends Command {
	public UpdateCommand(Map<String,Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy)pxy.get("req");
		HttpServletRequest request = req.getRequest();

		CustomerDTO cus = new CustomerDTO();
		cus.setCustomerId(request.getParameter("customer_Id"));
		cus = CustomerServiceImpl.getInstance().retrieveCustomer(cus);
		
		String phone = request.getParameter("phone");
		String postalCode = request.getParameter("postalCode");
		String city = request.getParameter("city");
		String address = request.getParameter("address");
		String password = request.getParameter("password");

		cus.setPhone((phone.equals("")) ? cus.getPhone() : request.getParameter("phone"));
		cus.setAddress((address.equals("")) ? cus.getAddress(): request.getParameter("address"));
		cus.setCity((city.equals("")) ? cus.getCity() : request.getParameter("city"));
		cus.setPostalCode((postalCode.equals("")) ? cus.getPostalCode() : request.getParameter("postalCode"));
		cus.setPassword((password.equals("")) ? cus.getPassword(): request.getParameter("password"));
		CustomerServiceImpl.getInstance().modifyCustomer(cus);
		request.setAttribute("cus",cus);
	}
}
