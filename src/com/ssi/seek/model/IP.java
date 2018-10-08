package com.ssi.seek.model;

import java.util.Date;

/**
 * @author Tisawudii
 * */
public class IP {
	private String IDCard;
	private String IP;
	private Date LastLoginDate;
	public String getIDCard() {
		return IDCard;
	}
	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public Date getLastLoginDate() {
		return LastLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		LastLoginDate = lastLoginDate;
	}
	
}
