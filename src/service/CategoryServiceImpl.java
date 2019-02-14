package service;

import java.util.List;

import dao.CategoryDAO;
import dao.CategoryDAOImpl;
import domain.CategoryDTO;

public class CategoryServiceImpl implements CategoryService {

	private static CategoryServiceImpl instance = new CategoryServiceImpl();
	
	private CategoryServiceImpl() {
		dao = CategoryDAOImpl.getInstance();
	}
	public static CategoryServiceImpl getInstance() {
		return instance;
	}
	
	CategoryDAO dao;
	
	
	
	@Override
	public void registCategory(CategoryDTO cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CategoryDTO> bringCategoryList() {
		// TODO Auto-generated method stub
		return dao.selectCategoryList();
	}

	@Override
	public List<CategoryDTO> retrieveCategorys(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectCategorys(searchWord);
	}

	@Override
	public CategoryDTO retrieveCategory(String searchWord) {
		// TODO Auto-generated method stub
		return dao.selectCategory(searchWord);
	}

	@Override
	public int countCategorys() {
		// TODO Auto-generated method stub
		return dao.countCategorys();
	}

	@Override
	public boolean existCategory(String searchWord) {
		// TODO Auto-generated method stub
		return dao.existCategory(searchWord);
	}

	@Override
	public void modifyCategory(CategoryDTO cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCategory(CategoryDTO cat) {
		// TODO Auto-generated method stub
		
	}

}
