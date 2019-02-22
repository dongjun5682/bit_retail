package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.CategoryDTO;
import enums.CategorySQL;
import enums.Vender;
import factory.DatabaseFactory;
import pooxy.PageProxy;
import pooxy.Pagination;
import pooxy.Proxy;

public class CategoryDAOImpl implements CategoryDAO{
	Connection conn;
	private static CategoryDAOImpl instance = new CategoryDAOImpl();
	
	private CategoryDAOImpl() {
		conn = DatabaseFactory.createDatabase(Vender.ORACLE).getConnection();
	}
	public static CategoryDAOImpl getInstance() {
		return instance;
	}

	
	
	@Override
	public void insertCategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CategoryDTO> selectCategoryList(Proxy pxy) {
		List<CategoryDTO> list = new ArrayList<>();
		
		try {
			Pagination page = ((PageProxy)pxy).getPage();
			PreparedStatement pstmt = conn.prepareStatement(CategorySQL.LIST.toString());
			pstmt.setInt(1,page.getStartPage());
			pstmt.setInt(2,page.getEndPage());
			ResultSet rs = pstmt.executeQuery();
			CategoryDTO cate = null;
			while (rs.next()) {
				cate = new CategoryDTO();
				cate.setCategoryId(rs.getString("CATEGORY_ID"));
				cate.setCategoryName(rs.getString("CATEGORY_NAME"));
				cate.setDescription(rs.getString("DESCRIPTION"));
				list.add(cate);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<CategoryDTO> selectCategorys(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoryDTO selectCategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countCategorys(Proxy pxy) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existCategory(Proxy pxy) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateCategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategory(CategoryDTO cate) {
		// TODO Auto-generated method stub
		
	}

}
