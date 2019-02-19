package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import domain.ImageDTO;
import enums.Vender;
import factory.DatabaseFactory;
import pooxy.Proxy;

public class ImageDAOImpl implements ImageDAO {
	
	private static ImageDAOImpl Instance = new ImageDAOImpl();
	Connection conn;
	private ImageDAOImpl() {}
	public static ImageDAOImpl getInstance() {
		return Instance;
	}
	
	@Override
	public void insertImage(ImageDTO img) {
		try {
			
		PreparedStatement pstmt =DatabaseFactory
				.createDatabase(Vender.ORACLE)
				.getConnection()
				.prepareStatement("");
				pstmt.setString(1, "");
				ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<ImageDTO> selectImageList(Proxy pxy) {

		return null;
	}
	@Override
	public List<ImageDTO> selectImages(ImageDTO img) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ImageDTO selectImage(ImageDTO img) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int countImage(ImageDTO img) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void updateImage(ImageDTO img) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteImage(ImageDTO img) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String lastImageSeq() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
