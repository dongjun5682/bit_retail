package dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.util.List;

import domain.EmployeeDTO;
import enums.EmployeeSQL;
import enums.Vender;
import factory.DatabaseFactory;

public class EmployeseDAOImpl implements EmployeeDAO{

	private static EmployeseDAOImpl instance = new EmployeseDAOImpl();
	private EmployeseDAOImpl() {

	}
	public static EmployeseDAOImpl getInstance() {
		return instance;
	}

	@Override
	public void insertEmployee(EmployeeDTO emp) {
		try {	
			Connection conn = DatabaseFactory
			.createDatabase(Vender.ORACLE)
			.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(EmployeeSQL.REGISTER.toString());
			pstmt.setString(1, emp.getManager());
			pstmt.setString(2, emp.getName());
			pstmt.setString(3, emp.getBirthDate());
			pstmt.setString(4, emp.getPhoto());
			pstmt.setString(5, emp.getNotes());
			int rs = pstmt.executeUpdate();
			System.out.println((rs == 1) ? "입력 성공" : "입력 실패");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<EmployeeDTO> selectEmployeeList() {
		
		return null;
	}

	@Override
	public List<EmployeeDTO> selectEmployees(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDTO selectEmployee(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countEmployees() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsEmployee(EmployeeDTO emp) {
		boolean exist = false;
		try {
			Connection conn = DatabaseFactory
					.createDatabase(Vender.ORACLE)
					.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(EmployeeSQL.ACCESS.toString());
			pstmt.setString(1, emp.getEmployeeID());
			pstmt.setString(2, emp.getName());
			if(pstmt.executeQuery().next()){
				exist = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return exist;
	}

	@Override
	public void updateEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		
	}

}
