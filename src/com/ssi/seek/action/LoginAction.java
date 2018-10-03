package com.ssi.seek.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssi.seek.dao.UserDao;
import com.ssi.seek.model.User;

@SuppressWarnings("serial")
public class LoginAction extends BaseAction {

	@Autowired
	private UserDao userDao;

	private User user;

	private String IDCard;
	private String UniformPwd;

	public String execute() throws Exception {
		user = userDao.getUserByName(IDCard);
		if (user != null) {
			if (user.getUniformPwd().equals(UniformPwd)) {
				return SUCCESS;
			}
		}
		return ERROR;
	}

	public String getIDCard() {
		return IDCard;
	}

	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}

	public String getUniformPwd() {
		return UniformPwd;
	}

	public void setUniformPwd(String uniformPwd) {
		UniformPwd = uniformPwd;
	}
	

}