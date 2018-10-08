package com.ssi.seek.dao;

import com.ssi.seek.model.IP;

public interface IPDao {
	public IP getIPByIDCard(String IDCard);
	public int insertIP(IP ip);
	public int deleteIP(String IDCard);
	public int updateIP(IP ip);
}