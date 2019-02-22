package service;

import java.util.List;

import dao.CategoryDAO;
import dao.CategoryDAOImpl;
import domain.CategoryDTO;
import pooxy.Proxy;

public class CategoryServiceImpl implements CategoryService {

	private static CategoryServiceImpl instance = new CategoryServiceImpl();
	CategoryDAO dao;
	private CategoryServiceImpl() {
		dao = CategoryDAOImpl.getInstance();
	}
	public static CategoryServiceImpl getInstance() {
		return instance;
	}
	
	@Override
	public void registCategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<?> bringCategoryList(Proxy pxy) {
		return dao.selectCategoryList(pxy);
	}

	@Override
	public List<CategoryDTO> retrieveCategorys(Proxy pxy) {
		// TODO Auto-generated method stub
		return dao.selectCategorys(pxy);
	}

	@Override
	public CategoryDTO retrieveCategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		return dao.selectCategory(cate);
	}

	@Override
	public int countCategorys(Proxy pxy) {
		// TODO Auto-generated method stub
		return dao.countCategorys(pxy);
	}

	@Override
	public boolean existCategory(Proxy pxy) {
		// TODO Auto-generated method stub
		return dao.existCategory(pxy);
	}

	@Override
	public void modifyCategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		
	}

}
