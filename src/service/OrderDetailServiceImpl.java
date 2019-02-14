package service;

import java.util.List;

import dao.OrderDetailDAO;
import dao.OrderDetailDAOImpl;
import domain.OrderDetailDTO;

public class OrderDetailServiceImpl implements OrderDetailService {

	private static OrderDetailServiceImpl instance = new OrderDetailServiceImpl();
	
	private OrderDetailServiceImpl() {
		dao = OrderDetailDAOImpl.getInstance();
	}
	public static OrderDetailServiceImpl getInstance() {
		return instance;
	}
	OrderDetailDAO dao;
	

	@Override
	public void registOrderDetail(OrderDetailDTO ord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderDetailDTO> bringOrderDetailList() {
		// TODO Auto-generated method stub
		return dao.selectOrderDetailList();
	}

	@Override
	public List<OrderDetailDTO> retrieveOrderDetails(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectOrderDetails(searchWord);
	}

	@Override
	public OrderDetailDTO retrieveOrderDetail(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectOrderDetail(searchWord);
	}

	@Override
	public int countOrderDetail() {
		// TODO Auto-generated method stub
		return dao.countOrderDetail();
	}

	@Override
	public boolean existOrderDetail(String searchWord) {
		// TODO Auto-generated method stub
		return dao.existOrderDetail(searchWord);
	}

	@Override
	public void modifyOrderDetail(OrderDetailDTO ord) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeOrderDetail(OrderDetailDTO ord) {
		// TODO Auto-generated method stub
		
	}

}
