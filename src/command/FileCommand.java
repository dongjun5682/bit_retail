package command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import com.oreilly.servlet.MultipartRequest;

import domain.CustomerDTO;
import domain.ImageDTO;
import enums.Action;
import pooxy.ImageProxy;
import pooxy.Proxy;
import pooxy.RequestProxy;
import service.CustomerServiceImpl;
import service.ImageServiceImpl;

public class FileCommand extends Command {

	public FileCommand(Map<String, Proxy> pxy) {
		super(pxy);
		RequestProxy req = (RequestProxy)pxy.get("req");
		HttpServletRequest request = req.getRequest();
		/*java.lang.String saveDirectory, 
		 *   int maxPostSize,
		 *   java.lang.String encoding,
		 *   FileRenamePolicy policy
		 *   */
		switch (Action.valueOf(request.getParameter("cmd").toUpperCase())) {
		case CUST_FILE_UPLOAD:
			System.out.println("파일커맨드 파일업로드 진입!!");
			ImageProxy ipxy = new ImageProxy();
			ipxy.carryOut(request);
		    Map<String,Object> map = CustomerServiceImpl.getInstance().fileUpload(ipxy);
			request.setAttribute("image",map.get("image"));
			request.setAttribute("cus", map.get("cus"));
			break;
		default:
			break;
		}
	}

}
