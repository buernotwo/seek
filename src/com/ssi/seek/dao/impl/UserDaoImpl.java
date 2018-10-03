package com.ssi.seek.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.ssi.seek.dao.UserDao;
import com.ssi.seek.model.User;


@Repository(value = "userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User getUserByName(String name) {

		User user = new User();

		// select语句，传入一个参数，返回User对象
		// -------------------------------------------------------------------------
		user = getSqlSession().selectOne("UserMapper.getUserByName", name);// select语句，传入一个参数，返回User对象

		// insert语句，传入一个对象
		// -------------------------------------------------------------------------------------
		User oneUser = new User();
		oneUser.setIDCard("6");
		oneUser.setName("go07");
		oneUser.setUniformPwd("pesd07");
		oneUser.setAge(Long.parseLong("25"));
		oneUser.setSex(Long.parseLong("1"));
		getSqlSession().insert("UserMapper.insertUser",oneUser);//insert语句，传入一个对象

		return user;
	}

}