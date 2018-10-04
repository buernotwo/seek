package com.ssi.seek.dao;

import com.ssi.seek.model.User;

public interface UserDao {
	public User getUserInfoByIDCard(String IDCard);
	public int deleteUser(String IDCard);
	public int updateUser(User userT);
}
