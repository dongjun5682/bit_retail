package service;

import java.util.List;

import dao.OrderDAO;
import dao.OrderDAOImpl;
import domain.OrderDTO;

public class OrderServiceImpl implements OrderService{

	private static OrderServiceImpl instance = new OrderServiceImpl();
	private OrderServiceImpl() {
		dao = OrderDAOImpl.getInstance();
	}	
	public static OrderServiceImpl getInstance() {
		return instance;
	}
	OrderDAO dao;
	

	@Override
	public void registOrder(OrderDTO or) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<OrderDTO> bringOrderList() {
		// TODO Auto-generated method stub
		return dao.selectOrderList();
	}

	@Override
	public List<OrderDTO> retrieveOrders(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectOrders(searchWord);
	}

	@Override
	public OrderDTO retrieveOrder(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectOrder(searchWord);
	}

	@Override
	public int countOrders() {
		// TODO Auto-generated method stub
		return dao.countOrders();
	}

	@Override
	public boolean existOrder(String searchWord) {
		// TODO Auto-generated method stub
		return dao.existOrder(searchWord);
	}

	@Override
	public void modifyOrder(OrderDTO or) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeOrder(OrderDTO or) {
		// TODO Auto-generated method stub
		
	}

}
