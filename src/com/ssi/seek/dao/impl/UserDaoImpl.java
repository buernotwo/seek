package com.ssi.seek.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.ssi.seek.dao.UserDao;
import com.ssi.seek.model.User;


@Repository(value = "userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User getUserInfoByIDCard(String IDCard) {

		User user = new User();

		// select语句，传入一个参数，返回User对象
		// -------------------------------------------------------------------------
		user = getSqlSession().selectOne("UserMapper.getUserInfoBySeekString", IDCard);

		// insert语句，传入一个对象
		// -------------------------------------------------------------------------------------
		User oneUser = new User();
		oneUser.setAge(Long.parseLong("25"));
		oneUser.setCollege("xx戏剧学院");
		oneUser.setCompany("xx传媒有限责任公司");
		oneUser.setCompanyIDCard("xx30010010");
		oneUser.setConnectInfo("xx13800000000");
		oneUser.setDescription("xx舞蹈，唱歌");
		oneUser.setEmail("xxwei@weilaichuanmei.com");
		oneUser.setHobbies("xx舞蹈，瑜伽");
		oneUser.setHome("xx青岛市");
		oneUser.setHomeMembers("xx口人");
		oneUser.setHomeTown("山东省青岛市");
		oneUser.setIDCard("xxxxxxxxxxxxxxxxxx");
		oneUser.setMiddleSchool("xx第101中学");
		oneUser.setName("xx薇");
		oneUser.setNationality("xx中国");
		oneUser.setNickName("xx薇儿");
		oneUser.setPhoneNumber("xx13800000000");
		oneUser.setPic("暂无");
		oneUser.setPostXXs("95s");
		oneUser.setPrimarySchool("xx第8小学");
		oneUser.setSex("女");
		oneUser.setSocialAccount("xx13800000000");
		oneUser.setUniformPwd("XXXXxxxx");
		
		if("xxxxxxxxxxxxxxxxxx".equals(IDCard)){
			if((user == null)){
				getSqlSession().insert("UserMapper.insertUser",oneUser);
				return oneUser;
			}else{
				getSqlSession().update("UserMapper.updateUser",oneUser);
				return oneUser;
			}
		}
		return null;
	}

	@Override
	public int deleteUser(String IDCard) {
		return getSqlSession().delete("UserMapper.deleteUser",IDCard);
	}

	@Override
	public int updateUser(User userT) {
		return getSqlSession().update("UserMapper.updateUser", userT);
	}

}