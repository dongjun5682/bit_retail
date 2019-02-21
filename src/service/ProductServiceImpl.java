package service;

import java.util.List;

import dao.ProductDAO;
import dao.ProductDAOImpl;
import domain.ProductDTO;
import pooxy.Proxy;

public class ProductServiceImpl implements ProductService {

	private static ProductServiceImpl instance = new ProductServiceImpl();
	private ProductServiceImpl() {
		dao = ProductDAOImpl.getInstance();
	}	
	public static ProductServiceImpl getInstance() {
		return instance;
	}
	ProductDAO dao;
	
	
	
	@Override
	public void registProduct(ProductDTO pro) {
		dao.insertProduct(pro);
	}

	@Override
	public List<ProductDTO> bringProductList(Proxy pxy) {
		return dao.selectProductList(pxy);
	}

	@Override
	public List<ProductDTO> retrieveProducts(Proxy pxy) {
		// TODO Auto-generated method stub
		return dao.selectProducts(pxy);
	}

	@Override
	public ProductDTO retrieveProduct(ProductDTO pro) {
		return dao.selectProduct(pro);
	}

	@Override
	public int countProduct(Proxy pxy) {
		// TODO Auto-generated method stub
		return dao.countProduct(pxy);
	}

	@Override
	public boolean existProduct(ProductDTO pro) {
		// TODO Auto-generated method stub
		return dao.existProduct(pro);
	}

	@Override
	public void modifyProduct(ProductDTO pro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProduct(ProductDTO pro) {
		// TODO Auto-generated method stub
		
	}

}
