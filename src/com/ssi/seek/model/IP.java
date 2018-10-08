package com.ssi.seek.model;

import java.util.Date;

/**
 * @author Tisawudii
 * */
public class IP {
	private String IPID;
	private String IDCard;
	private String IP;
	private Date LastestLoginDate;
	
	public String getIPID() {
		return IPID;
	}
	public void setIPID(String iPID) {
		IPID = iPID;
	}
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
		return LastestLoginDate;
	}
	public void setLastLoginDate(Date lastLoginDate) {
		LastestLoginDate = lastLoginDate;
	}
	
}
