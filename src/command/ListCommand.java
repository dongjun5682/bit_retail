package command;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import domain.CustomerDTO;
import domain.ImageDTO;
import domain.ProductDTO;
import enums.Action;
import pooxy.PageProxy;
import pooxy.Pagination;
import pooxy.Proxy;
import pooxy.RequestProxy;
import service.CustomerServiceImpl;
import service.ImageServiceImpl;
import service.ProductServiceImpl;

public class ListCommand extends Command {
	
	public ListCommand(Map<String,Proxy> pxy){
		super(pxy);
		RequestProxy req = (RequestProxy)pxy.get("req");
		HttpServletRequest request = req.getRequest();
		Proxy paging = new Pagination();
		paging.carryOut(request);
		Proxy pagePxy = new PageProxy();
		pagePxy.carryOut(paging);
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case CUSTOMER_LIST:
			List<CustomerDTO> list = CustomerServiceImpl.getInstance().bringCustomerList(pagePxy);
				request.setAttribute("list",list);
				request.setAttribute("pagination",paging);
			break;
		case PRO_LIST:
			List<ProductDTO> pro_list = ProductServiceImpl.getInstance().bringProductList(pagePxy);
			request.setAttribute("list",pro_list);
			request.setAttribute("pagination", paging);
			break;
		default:
			break;
		}
		
	}
}
