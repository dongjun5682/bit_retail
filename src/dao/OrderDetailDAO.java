package dao;

import java.util.List;

import domain.OrderDetailDTO;

public interface OrderDetailDAO {


	public void insertOrderDetail(OrderDetailDTO ord);
	public List<OrderDetailDTO> selectOrderDetailList();
	public List<OrderDetailDTO> selectOrderDetails(String searchWord);
	public OrderDetailDTO selectOrderDetail(String searchWord);
	
	public int countOrderDetail();
	public boolean existOrderDetail(String searchWord);
	
	public void updateOrderDetail(OrderDetailDTO ord);
	public void deleteOrderDetail(OrderDetailDTO ord);
}
