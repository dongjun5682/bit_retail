package service;

import java.util.List;

import dao.SupplierDAO;
import dao.SupplierDAOImpl;
import domain.SupplierDTO;

public class SupplierServiceImpl implements SupplierService{

	private static SupplierServiceImpl instance = new SupplierServiceImpl();
	private SupplierServiceImpl() {
		dao = SupplierDAOImpl.getInstance();
	}	
	public static SupplierServiceImpl getInstance() {
		return instance;
	}
	SupplierDAO dao;
	
	
	@Override
	public void registSupplier(SupplierDTO sup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<SupplierDTO> bringSupplierList() {
		// TODO Auto-generated method stub
		return dao.selectSupplierList();
	}

	@Override
	public List<SupplierDTO> retrieveSuppliers(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectSuppliers(searchWord);
	}

	@Override
	public SupplierDTO retrieveSupplier(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectSupplier(searchWord);
	}

	@Override
	public int countSuppliers() {
		// TODO Auto-generated method stub
		return dao.countSuppliers();
	}

	@Override
	public boolean existSupplier(String searchWord) {
		// TODO Auto-generated method stub
		return dao.existSupplier(searchWord);
	}

	@Override
	public void modifySupplier(SupplierDTO sup) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeSupplier(SupplierDTO sup) {
		// TODO Auto-generated method stub
		
	}

}
