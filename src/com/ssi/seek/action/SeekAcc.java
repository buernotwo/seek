package com.ssi.seek.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssi.seek.dao.ImageDao;
import com.ssi.seek.dao.UserDao;
import com.ssi.seek.model.Image;
import com.ssi.seek.model.User;


/**
 * 根据用户输入的关键字去数据库查找相关信息，并返回。
 * @author Tisawudii.Akun
 * */
@SuppressWarnings("serial")
public class SeekAcc extends BaseAction {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private ImageDao imageDao;
	
	private User user;
	private List<Image> imageList;
	private String SeekString;
	public String Seek() throws Exception {
		if("".equals(SeekString))
			return ERROR;
		User userT = userDao.getUserInfoByIDCard(SeekString);
		List<Image> imageListT = imageDao.getImageByIDCard(SeekString);
		if(userT != null)
			this.setUser(userT);
		if(!imageListT.isEmpty())
		{
			setImageList(imageListT);
		}
		if((userT != null) || (!imageListT.isEmpty()))
			return SUCCESS;
		return ERROR;
	}

	public String getSeekString() {
		return SeekString;
	}

	public void setSeekString(String seekString) {
		SeekString = seekString;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Image> getImageList() {
		return imageList;
	}

	public void setImageList(List<Image> imageList) {
		this.imageList = imageList;
	}


	
}