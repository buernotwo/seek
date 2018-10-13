package com.ssi.seek.model;

public class ConnectDirect {
	private String ConnectDirectID;
	private String IDCard;
	private String IP;
	private String Area;
	private boolean WhetherEstablishConnect;
	public String getConnectDirectID() {
		return ConnectDirectID;
	}
	public void setConnectDirectID(String connectDirectID) {
		ConnectDirectID = connectDirectID;
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
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public boolean isWhetherEstablishConnect() {
		return WhetherEstablishConnect;
	}
	public void setWhetherEstablishConnect(boolean whetherEstablishConnect) {
		WhetherEstablishConnect = whetherEstablishConnect;
	}
}
