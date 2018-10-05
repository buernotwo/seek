package com.ssi.seek.action;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
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
		HttpServletRequest request = ServletActionContext.getRequest();
		String filePath = request.getSession().getServletContext().getRealPath("");//request.getContextPath();
		//request.getSession().getServletContext().getRealPath("");
		//C:\Users\Administrator\Workspaces\MyEclipse 10--\.metadata\.me_tcat\webapps\seek\111111.png
		if("".equals(SeekString))
			return ERROR;
		User userT = userDao.getUserInfoByIDCard(SeekString);
		List<Image> imageListT = imageDao.getImageByIDCard(SeekString);
		if(userT != null)
			this.setUser(userT);
		if(!imageListT.isEmpty())
		{
			setImageList(imageListT);
			for(Image image:imageListT){
				FileOutputStream outSTr = null;
				BufferedOutputStream Buff=null;
				outSTr = new FileOutputStream(new File(filePath+"\\"+image.getImageID()+".png"));
				System.out.println(filePath+"\\"+image.getImageID()+".png");
				Buff=new BufferedOutputStream(outSTr);
				Buff.write(image.getImage());
				Buff.flush();
				Buff.close();
			}
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