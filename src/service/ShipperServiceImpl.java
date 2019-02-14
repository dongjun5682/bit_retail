package service;

import java.util.List;



import dao.ShipperDAO;
import dao.ShipperDAOImpl;
import domain.ShipperDTO;

public class ShipperServiceImpl implements ShipperService{


	private static ShipperServiceImpl instance = new ShipperServiceImpl();
	private ShipperServiceImpl() {
		dao = ShipperDAOImpl.getInstance();
	}	
	public static ShipperServiceImpl getInstance() {
		return instance;
	}
	ShipperDAO dao;
	
	
	
	@Override
	public void registShipper(ShipperDTO shi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ShipperDTO> bringShipperList() {
		// TODO Auto-generated method stub
		return dao.selectShipperList();
	}

	@Override
	public List<ShipperDTO> retrieveShippers(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectShippers(searchWord);
	}

	@Override
	public ShipperDTO retrieveShipper(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectShipper(searchWord);
	}

	@Override
	public int countShippers() {
		// TODO Auto-generated method stub
		return dao.countShippers();
	}

	@Override
	public boolean existShipper(String searchWord) {
		// TODO Auto-generated method stub
		return dao.existShipper(searchWord);
	}

	@Override
	public void modifyShipper(ShipperDTO shi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeShipper(ShipperDTO shi) {
		// TODO Auto-generated method stub
		
	}

}
