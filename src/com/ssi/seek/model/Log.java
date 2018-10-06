package com.ssi.seek.model;

import java.util.Date;

/**
 * @author 天下无敌.阿坤
 */
public class Log {
	/*KEY，唯一标识log*/
	private String LogID;
	/*游客登陆时的IP地址*/
	private String IP;
	/*游客操作类型，1：增；2：删；3：改；4：查*/
	private int Type;
	/*游客具体操作记录*/
	private String Operation;
	/*游客操作时间*/
	private Date DateTime;
	
	public String getLogID() {
		return LogID;
	}
	public void setLogID(String logID) {
		LogID = logID;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public int getType() {
		return Type;
	}
	public void setType(int type) {
		Type = type;
	}
	public String getOperation() {
		return Operation;
	}
	public void setOperation(String operation) {
		Operation = operation;
	}
	public Date getDateTime() {
		return DateTime;
	}
	public void setDateTime(Date dateTime) {
		DateTime = dateTime;
	}
	
}