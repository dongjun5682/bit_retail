package service;

import java.util.List;

import dao.ImageDAOImpl;
import domain.ImageDTO;
import pooxy.Proxy;

public class ImageServiceImpl implements ImageService {

	private static ImageServiceImpl instance = new ImageServiceImpl();

	private ImageServiceImpl() {
		dao =ImageDAOImpl.getInstance();
	}

	public static ImageServiceImpl getInstance() {
		return instance;
	}

	ImageDAOImpl dao;
	
	@Override
	public void addImage(ImageDTO img) {
		dao.insertImage(img);
	}

	@Override
	public List<ImageDTO> imageList(Proxy pxy) {
		return dao.selectImageList(pxy);
	}

	@Override
	public List<ImageDTO> selectImages(ImageDTO img){
		return dao.selectImages(img);
	}

	@Override
	public ImageDTO searchImage(ImageDTO img) {
		return dao.selectImage(img);
	}

	@Override
	public int countImage(ImageDTO img) {
		return dao.countImage(img);
	}

	@Override
	public void modifyImage(ImageDTO img) {
		dao.updateImage(img);
	}

	@Override
	public void removeImage(ImageDTO img) {
		dao.deleteImage(img);
	}

}
