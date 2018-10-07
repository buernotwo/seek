package com.ssi.seek.action;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.ssi.seek.dao.ImageDao;
import com.ssi.seek.dao.UserDao;
import com.ssi.seek.model.Image;
import com.ssi.seek.model.User;
import com.ssi.seek.tool.SensitiveWordCheck;
import com.ssi.seek.tool.data.SensitiveWord;


/**
 * @author Tisawudii.Akun
 * */
@SuppressWarnings("serial")
public class SeekAcc extends BaseAction {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private ImageDao imageDao;
	
	private User user;
	private List<Image> imageList;
	private String SeekString;
	private SensitiveWord SWord;
	private long SensitiveWordCheckTime;
	
	public String Seek() throws Exception {
		if(("".equals(SeekString)) || (SeekString == null))
			return ERROR;
		long startNumber = System.currentTimeMillis();
		SensitiveWordCheck sw = new SensitiveWordCheck("CensorWords.txt");  
	    sw.InitializationWork();
	    long endNumber = System.currentTimeMillis();
	    
	    this.setSWord(sw.filterInfo(SeekString));
	    this.setSensitiveWordCheckTime(endNumber-startNumber);
	    if(this.getSWord().getSensitiveWordSize() > 0)
	    	return "SensitiveWord";
	    User userT = userDao.getUserInfoByIDCard(SeekString);
		List<Image> imageListT = imageDao.getImageByIDCard(SeekString);
		if(userT != null)
			this.setUser(userT);
		if(!imageListT.isEmpty())
		{
			setImageList(imageListT);
		}
		if((userT != null) || (!imageListT.isEmpty()))
			return SUCCESS;
		return ERROR;
	}

	public String getSeekString() {
		return SeekString;
	}

	public void setSeekString(String seekString) {
		SeekString = seekString;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Image> getImageList() {
		return imageList;
	}

	public void setImageList(List<Image> imageList) {
		this.imageList = imageList;
	}

	public SensitiveWord getSWord() {
		return SWord;
	}

	public void setSWord(SensitiveWord sWord) {
		SWord = sWord;
	}

	public long getSensitiveWordCheckTime() {
		return SensitiveWordCheckTime;
	}

	public void setSensitiveWordCheckTime(long sensitiveWordCheckTime) {
		SensitiveWordCheckTime = sensitiveWordCheckTime;
	}
	
}