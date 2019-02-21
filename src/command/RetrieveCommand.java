package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import domain.CustomerDTO;
import domain.ImageDTO;
import domain.ProductDTO;
import enums.Action;
import pooxy.Proxy;
import pooxy.RequestProxy;
import service.CustomerServiceImpl;
import service.ImageServiceImpl;
import service.ProductServiceImpl;

public class RetrieveCommand extends Command{
	
	public RetrieveCommand(Map<String,Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy)pxy.get("req");
		HttpServletRequest request = req.getRequest();
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case CUST_RETRIEVE:
			CustomerDTO cus = new CustomerDTO();
			cus.setCustomerId(request.getParameter("customer_Id"));
			cus = CustomerServiceImpl.getInstance().retrieveCustomer(cus);
		    ImageDTO img = new ImageDTO();
			img = ImageServiceImpl.getInstance().searchImageSeq(cus);
			request.setAttribute("cus", cus);
			request.setAttribute("image", img);
			break;
		case PRODUCT_RETRIEVE:
			ProductDTO pro = new ProductDTO();
			pro.setProductId(request.getParameter("product_Id"));
			System.out.println("product_id : "+ request.getParameter("product_Id"));
			pro = ProductServiceImpl.getInstance().retrieveProduct(pro);
			request.setAttribute("pro",pro);
			break;
		default:
			break;
		}
		
	}
}
