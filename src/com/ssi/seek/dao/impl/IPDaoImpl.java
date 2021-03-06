package com.ssi.seek.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.ssi.seek.dao.IPDao;
import com.ssi.seek.model.IP;

@Repository(value = "IPDao")
public class IPDaoImpl extends SqlSessionDaoSupport implements IPDao{

	@Override
	public IP getIPByIDCard(String IDCard) {
		IP ip = new IP();
		ip = getSqlSession().selectOne("IPMapper.getIPByIDCard", IDCard);
		if (ip != null)
				return ip;
		return null;
	}

	@Override
	public int insertIP(IP ip) {
		return getSqlSession().insert("IPMapper.insertIP", ip);
	}

	@Override
	public int deleteIP(String IDCard) {
		return getSqlSession().delete("IPMapper.deleteIP", IDCard);
	}

	@Override
	public int updateIP(IP ip) {
		return getSqlSession().update("IPMapper.updateIP", ip);
	}
	
}