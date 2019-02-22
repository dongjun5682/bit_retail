package dao;

import java.util.List;

import domain.CustomerDTO;
import domain.ImageDTO;
import pooxy.Proxy;

public interface ImageDAO {
	
	public void insertImage(ImageDTO img);
	public List<ImageDTO> selectImageList(Proxy pxy);
	public List<ImageDTO> selectImages(ImageDTO img);
	public ImageDTO selectImage(ImageDTO img);
	public ImageDTO selectImageSeq(ImageDTO img);
	public String lastImageSeq();
	public int countImage(ImageDTO img);
	public void updateImage(ImageDTO img);
	public void deleteImage(ImageDTO img);

}
