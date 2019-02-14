package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.SupplierService;
import service.SupplierServiceImpl;

/**
 * Servlet implementation class SupplierController
 */
@WebServlet("/Supplier.do")
public class SupplierController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	SupplierService supplierService =SupplierServiceImpl.getInstance(); 
	
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
	}


}
