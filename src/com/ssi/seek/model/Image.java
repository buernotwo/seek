package com.ssi.seek.model;

/**
 * @author Tisawudii
 */
public class Image {
	
	private String IDCard;
	
	private String ImageID;
	
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