package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import domain.ImageDTO;
import pooxy.Proxy;
import pooxy.RequestProxy;
import service.CustomerServiceImpl;
import service.ImageServiceImpl;

public class RetrieveCommand extends Command{
	
	public RetrieveCommand(Map<String,Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy)pxy.get("req");
		HttpServletRequest request = req.getRequest();
		CustomerDTO cus = new CustomerDTO();
		
		cus.setCustomerId(request.getParameter("customer_Id"));
		System.out.println("ID : "+ request.getParameter("customer_Id"));
		cus = CustomerServiceImpl.getInstance().retrieveCustomer(cus);
		System.out.println("CUST :: "+cus.getPhoto());
	    ImageDTO img = new ImageDTO();
		img = ImageServiceImpl.getInstance().searchImageSeq(cus);
		System.out.println("img 객체의 값은 : "+ img);
		request.setAttribute("cus", cus);
		request.setAttribute("image", img);
	}
}
