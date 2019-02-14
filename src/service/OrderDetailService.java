package service;

import java.util.List;

import domain.OrderDetailDTO;



public interface OrderDetailService {

	public void registOrderDetail(OrderDetailDTO ord);
	public List<OrderDetailDTO> bringOrderDetailList();
	public List<OrderDetailDTO> retrieveOrderDetails(String searchWord);
	public OrderDetailDTO retrieveOrderDetail(String searchWord);
	
	public int countOrderDetail();
	public boolean existOrderDetail(String searchWord);
	
	public void modifyOrderDetail(OrderDetailDTO ord);
	public void removeOrderDetail(OrderDetailDTO ord);
	
}
