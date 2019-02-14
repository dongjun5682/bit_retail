package command;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import domain.CustomerDTO;
import pooxy.PageProxy;
import pooxy.Pagination;
import pooxy.Proxy;
import pooxy.RequestProxy;
import service.CustomerServiceImpl;

public class ListCommand extends Command {
	
	public ListCommand(Map<String,Proxy> pxy){
		super(pxy);
		RequestProxy req = (RequestProxy)pxy.get("req");
		HttpServletRequest request = req.getRequest();
		Proxy paging = new Pagination();
		paging.carryOut(request);
		Proxy pagePxy = new PageProxy();
		pagePxy.carryOut(paging);
		List<CustomerDTO> list = CustomerServiceImpl
							.getInstance()
						.bringCustomerList(pagePxy);
		request.setAttribute("list",list);
		request.setAttribute("pagination",paging);
	}
}
