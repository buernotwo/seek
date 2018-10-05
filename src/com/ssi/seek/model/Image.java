package com.ssi.seek.model;

/**
 * @author 天下无敌.阿坤
 */
public class Image {
	
	/*身份证号*/
	private String IDCard;
	
	/*图片ID*/
	private String ImageID;
	
	/*图片*/
	private byte[] Image;

	public String getIDCard() {
		return IDCard;
	}

	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}

	public String getImageID() {
		return ImageID;
	}

	public void setImageID(String imageID) {
		ImageID = imageID;
	}

	public byte[] getImage() {
		return Image;
	}

	public void setImage(byte[] image) {
		Image = image;
	}
	
	
}