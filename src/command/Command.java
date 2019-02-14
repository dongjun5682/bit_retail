package command;

import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import lombok.Data;
import pooxy.Proxy;
import pooxy.RequestProxy;

@Data
public class Command implements Order {
	protected String action, domain, page, view;
	public Command(Map<String,Proxy> pxy) {
		System.out.println("------6-------");
		RequestProxy req = (RequestProxy)pxy.get("req");
		HttpServletRequest request = req.getRequest();
		setAction(request.getParameter("cmd"));
		String dir = request.getParameter("dir");
		if (dir == null) {
			setDomain(request.getServletPath().split("/")[1].replace(".do", ""));
		} else {
			setDomain(dir);
		}
		setPage(request.getParameter("page"));
		execute();
	}

	public Command() {} // 오버로딩

	@Override
	public void execute() {
		this.view = "/WEB-INF/view/" + domain + "/" + page + ".jsp";
	}
}
