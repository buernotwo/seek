package com.ssi.seek.dao;

import com.ssi.seek.model.Log;

public interface LogDao {
	public Log getLogByLogID(String LogID);
	public int insertLog(Log log);
	public int deleteLog(String LogID);
	public int updateLog(Log log);
}