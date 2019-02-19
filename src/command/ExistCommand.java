package command;
import java.util.List;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import domain.CustomerDTO;
import domain.EmployeeDTO;
import enums.Action;
import pooxy.PageProxy;
import pooxy.Pagination;
import pooxy.Proxy;
import pooxy.RequestProxy;
import service.CustomerServiceImpl;
import service.EmployeeServiceImpl;

public class ExistCommand extends Command {
	public ExistCommand(Map<String,Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy)pxy.get("req");
		HttpServletRequest request = req.getRequest();
		HttpSession session = request.getSession();
		
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case ACCESS:
			EmployeeDTO emp = new EmployeeDTO();
			emp.setEmployeeID(request.getParameter("empno"));
			emp.setName(request.getParameter("name"));
			boolean exist = EmployeeServiceImpl.getInstance().existEmployee(emp);
			if (exist) {
				System.out.println("사원 접근 허용");
				Proxy paging = new Pagination();
				paging.carryOut(request);
				Proxy pagePxy = new PageProxy();
				pagePxy.carryOut(paging);
				List<CustomerDTO> list = CustomerServiceImpl.getInstance().bringCustomerList(pagePxy);
				System.out.println("총 고객수 : "+list.size());
				request.setAttribute("list", list);
				request.setAttribute("pagination",paging);
			} else {
				System.out.println("접근 불가");
				super.setDomain("employee");
				super.setPage("access");
				super.execute();
			}
			break;
		case SIGNIN:
			CustomerDTO cus = new CustomerDTO();
			cus.setCustomerId(request.getParameter("customerId"));
			cus.setPassword(request.getParameter("password"));
			cus = CustomerServiceImpl.getInstance().retrieveCustomer(cus);
			if(cus != null){
				System.out.println("로그인 성공");
				session.setAttribute("customer",cus);
			}else{
				System.out.println("로그인 실패");
				super.setDomain("customer");
				super.setPage("signin");
				super.execute();
			}
			break;
		default:
			break;
		}

	}
}
