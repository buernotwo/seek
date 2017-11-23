package com.ssi.seek.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssi.seek.dao.UserDao;
import com.ssi.seek.model.User;

public class LoginAction extends BaseAction {

	/**   
     *    
     */
	private static final long serialVersionUID = -439437585357651788L;

	@Autowired
	private UserDao userDao;

	private User user;

	private String username;
	private String password;

	public String execute() throws Exception {
		user = userDao.getUserByName(username);
		if (user != null) {
			if (user.getPwd().equals(password)) {
				return SUCCESS;
			}
		}
		return ERROR;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}