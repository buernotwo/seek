package com.ssi.seek.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.ssi.seek.dao.ImageDao;
import com.ssi.seek.model.Image;


@Repository(value = "ImageDao")
public class ImageDaoImpl extends SqlSessionDaoSupport implements ImageDao {

	@Override
	public List<Image> getImageByIDCard(String IDCard) {
		return getSqlSession().selectList("ImageMapper.getImageBySeekString", IDCard);
	}

	@Override
	public int insertImage(Image image) {
		return getSqlSession().insert("ImageMapper.insertImage", image);
	}

	@Override
	public int deleteImage(String IDCard) {
		return getSqlSession().delete("ImageMapper.deleteImage", IDCard);
	}

	@Override
	public int updateImage(Image image) {
		return getSqlSession().update("ImageMapper.updateImage", image);
	}
	
}