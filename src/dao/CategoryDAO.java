package dao;

import java.util.List;

import domain.CategoryDTO;
import pooxy.Proxy;

public interface CategoryDAO {
	
	public void insertCategory(CategoryDTO cate);
	public List<CategoryDTO> selectCategoryList(Proxy pxy);
	public List<CategoryDTO> selectCategorys(Proxy pxy);
	public CategoryDTO selectCategory(CategoryDTO cate);
	
	public int countCategorys(Proxy pxy);
	public boolean existCategory(Proxy pxy);
	
	public void updateCategory(CategoryDTO cate);
	public void deleteCategory(CategoryDTO cate);
	
}
