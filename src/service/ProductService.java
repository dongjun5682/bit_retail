package service;

import java.util.List;

import domain.ProductDTO;
import pooxy.Proxy;

public interface ProductService {

	public void registProduct(ProductDTO pro);
	public List<ProductDTO> bringProductList(Proxy pxy);
	public List<ProductDTO> retrieveProducts(Proxy pxy);
	public ProductDTO retrieveProduct(ProductDTO pro);
	
	public int countProduct(Proxy pxy);
	public boolean existProduct(ProductDTO pro);
	
	public void modifyProduct(ProductDTO pro);
	public void removeProduct(ProductDTO pro);
}
