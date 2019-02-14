package command;

import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import domain.CustomerDTO;
import domain.EmployeeDTO;
import enums.Action;
import pooxy.Proxy;
import pooxy.RequestProxy;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;

public class CreateCommand extends Command{

	public CreateCommand(Map<String,Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy)pxy.get("req");
		HttpServletRequest request = req.getRequest();
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case REGISTER:
			EmployeeDTO emp = new EmployeeDTO();
			emp.setManager(request.getParameter("manager"));
			emp.setBirthDate(request.getParameter("birthday"));
			emp.setName(request.getParameter("name"));
			emp.setPhoto(request.getParameter("photo"));
			emp.setNotes(request.getParameter("notes"));
			EmployeeServiceImpl.getInstance().registEmployee(emp);	
			break;
		case SIGNUP:
			CustomerDTO cus = new CustomerDTO();
			cus.setCustomerId(request.getParameter("customerId"));
			cus.setCustomerName(request.getParameter("customerName"));
			cus.setPassword(request.getParameter("password"));
			cus.setAddress(request.getParameter("address"));
			cus.setCity(request.getParameter("city"));
			cus.setPostalCode(request.getParameter("postalCode"));
			cus.setSsn(request.getParameter("ssn"));
			cus.setPhone(request.getParameter("phone"));
			CustomerServiceImpl.getInstance().registCustomer(cus);
			break;
		default:
			break;
		}
		
	
	}
}
