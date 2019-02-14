package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.CustomerDTO;
import pooxy.PageProxy;
import pooxy.Proxy;

public interface CustomerService {

	public void registCustomer(CustomerDTO cus);
	public List<CustomerDTO> bringCustomerList(Proxy pxy);
	public List<CustomerDTO> retrieveCustomers(Proxy pxy);
	public CustomerDTO retrieveCustomer(CustomerDTO cus);
	public int countCustomers(Proxy pxy);
	public boolean existCustomerID(CustomerDTO cus);
	public void modifyCustomer(CustomerDTO cus);
	public void removeCustomer(CustomerDTO cus);
	public Map<String,Object> retrievePhone(Proxy pxy);
}
