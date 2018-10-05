package com.ssi.seek.dao;

import java.util.List;

import com.ssi.seek.model.Image;

public interface ImageDao {
	public List<Image> getImageByIDCard(String IDCard);
	public int insertImage(Image image);
	public int deleteImage(String IDCard);
	public int updateImage(Image image);
}
