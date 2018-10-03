package com.ssi.seek.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 天下无敌.阿坤
 */
public class User {
	/*身份证号*/
	private String IDCard;
	/*国籍*/
	private String Nationality;
	/*几几后*/
	private String PostXXs;
	/*年龄*/
	private Long Age;
	/*姓名*/
	private String Name;
	/*昵称,曾用名*/
	private List<String> NickName;
	/*性别*/
	private Long Sex;
	/*籍贯*/
	private String HomeTown;
	/*手机号码*/
	private List<String> PhoneNumber;
	/*电子邮箱*/
	private List<String> Email;
	/*公司,公司地点*/
	private Map<String, String> Company;
	/*家庭住址*/
	private Map<String, String> Home;
	/*公司IDCard*/
	private Map<String, String> CompanyIDCard;
	/*小学*/
	private Map<String, Date> PrimarySchool;
	/*中学*/
	private Map<String, Date> MiddleSchool;
	/*大学*/
	private Map<String, Date> College;
	/*图片*/
	private List<Long> Pic;
	/*爱好*/
	private List<Long> Hobbies;
	/*家庭成员*/
	private Map<String, String> HomeMembers;
	/*家庭成员联系方式*/
	private Map<String, String> ConnectInfo;
	/*社交账号*/
	private Map<String, String> SocialAccount;
	/*密码*/
	private String UniformPwd;
	/*对User的描述*/
	private String Description;
	
	public String getIDCard() {
		return IDCard;
	}
	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	public String getPostXXs() {
		return PostXXs;
	}
	public void setPostXXs(String postXXs) {
		PostXXs = postXXs;
	}
	public Long getAge() {
		return Age;
	}
	public void setAge(Long age) {
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<String> getNickName() {
		return NickName;
	}
	public void setNickName(List<String> nickName) {
		NickName = nickName;
	}
	public Long getSex() {
		return Sex;
	}
	public void setSex(Long sex) {
		Sex = sex;
	}
	public String getHomeTown() {
		return HomeTown;
	}
	public void setHomeTown(String homeTown) {
		HomeTown = homeTown;
	}
	public List<String> getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public List<String> getEmail() {
		return Email;
	}
	public void setEmail(List<String> email) {
		Email = email;
	}
	public Map<String, String> getCompany() {
		return Company;
	}
	public void setCompany(Map<String, String> company) {
		Company = company;
	}
	public Map<String, String> getHome() {
		return Home;
	}
	public void setHome(Map<String, String> home) {
		Home = home;
	}
	public Map<String, String> getCompanyIDCard() {
		return CompanyIDCard;
	}
	public void setCompanyIDCard(Map<String, String> companyIDCard) {
		CompanyIDCard = companyIDCard;
	}
	public Map<String, Date> getPrimarySchool() {
		return PrimarySchool;
	}
	public void setPrimarySchool(Map<String, Date> primarySchool) {
		PrimarySchool = primarySchool;
	}
	public Map<String, Date> getMiddleSchool() {
		return MiddleSchool;
	}
	public void setMiddleSchool(Map<String, Date> middleSchool) {
		MiddleSchool = middleSchool;
	}
	public Map<String, Date> getCollege() {
		return College;
	}
	public void setCollege(Map<String, Date> college) {
		College = college;
	}
	public List<Long> getPic() {
		return Pic;
	}
	public void setPic(List<Long> pic) {
		Pic = pic;
	}
	public List<Long> getHobbies() {
		return Hobbies;
	}
	public void setHobbies(List<Long> hobbies) {
		Hobbies = hobbies;
	}
	public Map<String, String> getHomeMembers() {
		return HomeMembers;
	}
	public void setHomeMembers(Map<String, String> homeMembers) {
		HomeMembers = homeMembers;
	}
	public Map<String, String> getConnectInfo() {
		return ConnectInfo;
	}
	public void setConnectInfo(Map<String, String> connectInfo) {
		ConnectInfo = connectInfo;
	}
	public Map<String, String> getSocialAccount() {
		return SocialAccount;
	}
	public void setSocialAccount(Map<String, String> socialAccount) {
		SocialAccount = socialAccount;
	}
	public String getUniformPwd() {
		return UniformPwd;
	}
	public void setUniformPwd(String uniformPwd) {
		UniformPwd = uniformPwd;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
}