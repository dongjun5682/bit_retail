package service;

import java.util.List;

import dao.ProductDAO;
import dao.ProductDAOImpl;
import domain.ProductDTO;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProductDTO> bringProductList() {
		// TODO Auto-generated method stub
		return dao.selectProductList();
	}

	@Override
	public List<ProductDTO> retrieveProducts(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectProducts(searchWord);
	}

	@Override
	public ProductDTO retrieveProduct(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectProduct(searchWord);
	}

	@Override
	public int countProduct() {
		// TODO Auto-generated method stub
		return dao.countProduct();
	}

	@Override
	public boolean existProduct(String searchWord) {
		// TODO Auto-generated method stub
		return dao.existProduct(searchWord);
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
