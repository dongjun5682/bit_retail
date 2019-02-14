package dao;

import java.util.List;

import domain.ProductDTO;

public interface ProductDAO {

	public void insertProduct(ProductDTO pro);
	public List<ProductDTO> selectProductList();
	public List<ProductDTO> selectProducts(String searchWord);
	public ProductDTO selectProduct(String searchWord);
	
	public int countProduct();
	public boolean existProduct(String searchWord);
	
	public void updateProduct(ProductDTO pro);
	public void deleteProduct(ProductDTO pro);
}
