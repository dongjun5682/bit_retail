package dao;

import java.util.List;

import domain.CategoryDTO;

public interface CategoryDAO {
	
	public void insertCategory(CategoryDTO cat);
	public List<CategoryDTO> selectCategoryList();
	public List<CategoryDTO> selectCategorys(String searchWord);
	public CategoryDTO selectCategory(String searchWord);
	
	public int countCategorys();
	public boolean existCategory(String searchWord);
	
	public void updateCategory(CategoryDTO cat);
	public void deleteCategory(CategoryDTO cat);
	
}
