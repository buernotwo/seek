package com.ssi.seek.action;


/**
 * 根据用户输入的关键字去数据库查找相关信息，并return.
 * */
@SuppressWarnings("serial")
public class SeekAcc extends BaseAction {
	
	private String SeekString;
	private String OutString;
	public String Seek() throws Exception {
		//根据SeekString从数据库查询相关信息返回
		this.setOutString(SeekString+"女，江北人");
		return SUCCESS;
	}

	public String getSeekString() {
		return SeekString;
	}

	public void setSeekString(String seekString) {
		SeekString = seekString;
	}

	public String getOutString() {
		return OutString;
	}

	public void setOutString(String outString) {
		OutString = outString;
	}
	
}