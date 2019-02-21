package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.ProductDTO;
import enums.ProductSQL;
import enums.Vender;
import factory.DatabaseFactory;
import pooxy.PageProxy;
import pooxy.Pagination;
import pooxy.Proxy;

public class ProductDAOImpl implements ProductDAO{
	Connection conn;
	private static ProductDAOImpl instance = new ProductDAOImpl();
	private ProductDAOImpl() {
		conn = DatabaseFactory.createDatabase(Vender.ORACLE).getConnection();
	}
	public static ProductDAOImpl getInstance() {
		return instance;
	}
	
	@Override
	public void insertProduct(ProductDTO pro) {
		try {
			PreparedStatement pstmt = conn.prepareStatement(ProductSQL.INSERT.toString());
			pstmt.setString(1,pro.getProductName());
			pstmt.setString(2,pro.getSupplierId());
			pstmt.setString(3,pro.getCategoryId());
			pstmt.setString(4,pro.getUnit());
			pstmt.setString(5,pro.getPrice());
			int rs = pstmt.executeUpdate();
			if(rs == 1){
				System.out.println("상품 등록 성공 !!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<ProductDTO> selectProductList(Proxy pxy) {
		List<ProductDTO> list = new ArrayList<>();
		try {
			Pagination page = ((PageProxy) pxy).getPage(); 
			PreparedStatement pstmt = conn.prepareStatement(ProductSQL.LIST.toString());
			System.out.println("start :: "+ String.valueOf(page.getStartPage()));
			System.out.println("ende :: "+ String.valueOf(page.getEndPage()));
			
			pstmt.setString(1, String.valueOf(page.getStartPage()));
			pstmt.setString(2, String.valueOf(page.getEndPage()));
			ResultSet rs = pstmt.executeQuery();
			ProductDTO pro = null;
			while (rs.next()) {
				pro = new ProductDTO();
				pro.setCategoryId(rs.getString("category_id"));
				pro.setPrice(rs.getString("price"));
				pro.setProductId(rs.getString("product_id"));
				pro.setProductName(rs.getString("product_name"));
				pro.setSupplierId(rs.getString("supplier_id"));
				pro.setUnit(rs.getString("unit"));
				pro.setPhoto(rs.getString("photo"));
				list.add(pro);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public List<ProductDTO> selectProducts(Proxy pxy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO selectProduct(ProductDTO pro) {
		ProductDTO temp = new ProductDTO();
		try {
			PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM PRODUCTS WHERE PRODUCT_ID LIKE ?");
			pstmt.setString(1,pro.getProductId());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				temp.setCategoryId(rs.getString("category_id"));
				temp.setPrice(rs.getString("price"));
				temp.setProductId(rs.getString("product_id"));
				temp.setProductName(rs.getString("product_name"));
				temp.setSupplierId(rs.getString("supplier_id"));
				temp.setUnit(rs.getString("unit"));
				temp.setPhoto(rs.getString("photo"));
			}
			System.out.println("temp : "+ temp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return temp;
	}

	@Override
	public int countProduct(Proxy pxy) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existProduct(ProductDTO pro) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateProduct(ProductDTO pro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(ProductDTO pro) {
		// TODO Auto-generated method stub
		
	}

}
