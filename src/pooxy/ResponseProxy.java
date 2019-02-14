package pooxy;

import javax.servlet.http.HttpServletResponse;

import lombok.Data;
@Data
public class ResponseProxy implements Proxy{
	private HttpServletResponse response;
	@Override
	public void carryOut(Object o) {
		System.out.println("--------4--------");
			setResponse((HttpServletResponse) o);
	}

}
