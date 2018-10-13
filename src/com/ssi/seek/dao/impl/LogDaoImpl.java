package com.ssi.seek.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.ssi.seek.dao.LogDao;
import com.ssi.seek.model.Log;

@Repository(value = "LogDao")
public class LogDaoImpl extends SqlSessionDaoSupport implements LogDao{

	@Override
	public Log getLogByLogID(String LogID) {
		return getSqlSession().selectOne("LogMapper.getLogByLogID", LogID);
	}

	@Override
	public int insertLog(Log log) {
		return getSqlSession().insert("LogMapper.insertLog", log);
	}

	@Override
	public int deleteLog(String LogID) {
		return getSqlSession().update("LogMapper.deleteLog", LogID);
	}

	@Override
	public int updateLog(Log log) {
		return getSqlSession().update("LogMapper.updateLog", log);
	}
	
}