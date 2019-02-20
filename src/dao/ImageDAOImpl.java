package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import domain.CustomerDTO;
import domain.ImageDTO;
import enums.ImageSQL;
import enums.Vender;
import factory.DatabaseFactory;
import pooxy.Proxy;

public class ImageDAOImpl implements ImageDAO {
	
	private static ImageDAOImpl Instance = new ImageDAOImpl();
	Connection conn;
	private ImageDAOImpl() {
		conn = DatabaseFactory.createDatabase(Vender.ORACLE).getConnection();
	}
	public static ImageDAOImpl getInstance() {
		return Instance;
	}
	
	@Override
	public void insertImage(ImageDTO img) {
		try {
		
		PreparedStatement pstmt =conn.prepareStatement(ImageSQL.UPLOAD_FILE.toString());
				pstmt.setString(1, img.getImgName());
				pstmt.setString(2,img.getImgExtention());
				pstmt.setString(3,img.getOwner());
				int rs = pstmt.executeUpdate();
				if(rs == 1 ){
					System.out.println("파일 insert 성공 !!");
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
		ImageDTO image = new ImageDTO();
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM IMAGE WHERE OWNER LIKE ?");
			ps.setString(1,img.getOwner());
			System.out.println("오너 아이디 :: " + img.getOwner());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				image.setImgName(rs.getString("IMG_NAME"));
				image.setImgExtention(rs.getString("IMG_EXTENTION"));
				image.setImgSeq(rs.getString("IMG_SEQ"));
				image.setOwner(rs.getString("OWNER"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return image;
	}
	@Override
	public ImageDTO selectImageSeq(CustomerDTO cust) {
		ImageDTO image = new ImageDTO();
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM IMAGE WHERE IMG_SEQ LIKE ?");
			System.out.println("PHOTO :: "+cust.getPhoto());
			ps.setString(1,cust.getPhoto());
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				image.setImgName(rs.getString("IMG_NAME"));
				image.setImgExtention(rs.getString("IMG_EXTENTION"));
				image.setImgSeq(rs.getString("IMG_SEQ"));
				image.setOwner(rs.getString("OWNER"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return image;
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
		String seq = "";
		try {
			PreparedStatement pstmt = conn.prepareStatement(ImageSQL.LAST_SEQ.toString());
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				seq = rs.getString("IMG_SEQ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return seq;
	}
	
}
