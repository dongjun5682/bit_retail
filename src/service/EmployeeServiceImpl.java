package service;

import java.util.List;

import dao.EmployeeDAO;
import dao.EmployeseDAOImpl;
import domain.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {

	private static EmployeeServiceImpl instance = new EmployeeServiceImpl();
	private EmployeeServiceImpl() {		
		dao = EmployeseDAOImpl.getInstance();
	}	
	public static EmployeeServiceImpl getInstance() {return instance;}
	
	EmployeeDAO dao;
	
	@Override
	public void registEmployee(EmployeeDTO emp) {
		dao.insertEmployee(emp);
	}

	@Override
	public List<EmployeeDTO> bringEmployeeList() {
		// TODO Auto-generated method stub
		return dao.selectEmployeeList();
	}

	@Override
	public List<EmployeeDTO> retrieveEmployees(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectEmployees(searchWord);
	}

	@Override
	public EmployeeDTO retrieveEmployee(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectEmployee(searchWord);
	}

	@Override
	public int countEmployees() {
		// TODO Auto-generated method stub
		return dao.countEmployees();
	}

	@Override
	public boolean existEmployee(EmployeeDTO emp) {
		
		return dao.existsEmployee(emp);
	}

	@Override
	public void modifyEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removerEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub

	}

}
