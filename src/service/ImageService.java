package service;

import java.util.List;

import domain.CustomerDTO;
import domain.ImageDTO;
import pooxy.Proxy;

public interface ImageService {
	public void addImage(ImageDTO img);
	public List<ImageDTO> imageList(Proxy pxy);
	public List<ImageDTO> selectImages(ImageDTO img);
	public ImageDTO searchImage(ImageDTO img);
	public ImageDTO searchImageSeq(ImageDTO img);
	public int countImage(ImageDTO img);
	public void modifyImage(ImageDTO img);
	public void removeImage(ImageDTO img);
}
