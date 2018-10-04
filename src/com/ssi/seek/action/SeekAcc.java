package com.ssi.seek.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssi.seek.dao.UserDao;
import com.ssi.seek.model.User;


/**
 * 根据用户输入的关键字去数据库查找相关信息，并return.
 * */
@SuppressWarnings("serial")
public class SeekAcc extends BaseAction {
	
	@Autowired
	private UserDao userDao;
	
	private User user;
	private String SeekString;
	public String Seek() throws Exception {
		//根据SeekString从数据库查询相关信息返回
		if("".equals(SeekString))
			return ERROR;
		User userT = userDao.getUserInfoByIDCard(SeekString);
		if(userT != null)
		{
			this.setUser(userT);
			//userDao.deleteUser(userT.getIDCard());
			return SUCCESS;
		}
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
	
}