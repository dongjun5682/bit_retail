package service;

import java.util.List;

import domain.CategoryDTO;

public interface CategoryService {
	public void registCategory(CategoryDTO cat);
	public List<CategoryDTO> bringCategoryList();
	public List<CategoryDTO> retrieveCategorys(String searchWord);
	public CategoryDTO retrieveCategory(String searchWord);
	public int countCategorys();
	public boolean existCategory(String searchWord);
	public void modifyCategory(CategoryDTO cat);
	public void removeCategory(CategoryDTO cat);
	
}
