package com.ssi.seek.dao;

import com.ssi.seek.model.User;

public interface UserDao {
	public User getUserInfoBySeekString(String name);
}
