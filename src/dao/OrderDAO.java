package dao;

import java.util.List;

import domain.OrderDTO;

public interface OrderDAO {

	public void insertOrder(OrderDTO or);
	public List<OrderDTO> selectOrderList();
	public List<OrderDTO> selectOrders(String searchWord);
	public OrderDTO selectOrder(String searchWord);
	
	public int countOrders();
	public boolean existOrder(String searchWord);
	
	public void updateOrder(OrderDTO or);
	public void deleteOrder(OrderDTO or);
}
