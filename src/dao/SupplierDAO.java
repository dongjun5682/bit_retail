package dao;

import java.util.List;

import domain.SupplierDTO;

public interface SupplierDAO {
	
	public void insertSupplier(SupplierDTO sup);
	public List<SupplierDTO> selectSupplierList();
	public List<SupplierDTO> selectSuppliers(String searchWord);
	public SupplierDTO selectSupplier(String searchWord);
	
	public int countSuppliers();
	public boolean existSupplier(String searchWord);
	
	public void updateSupplier(SupplierDTO sup);
	public void deleteSupplier(SupplierDTO sup);
}
