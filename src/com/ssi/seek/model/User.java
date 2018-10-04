package com.ssi.seek.model;

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
	//private List<String> NickName;
	private String NickName;
	/*性别*/
	private String Sex;
	/*籍贯*/
	private String HomeTown;
	/*手机号码*/
	//private List<String> PhoneNumber;
	private String PhoneNumber;
	/*电子邮箱*/
	//private List<String> Email;
	private String Email;
	/*公司,公司地点*/
	//private Map<String, String> Company;
	private String Company;
	/*家庭住址*/
	//private Map<String, String> Home;
	private String Home;
	/*公司IDCard*/
	//private Map<String, String> CompanyIDCard;
	private String CompanyIDCard;
	/*小学*/
	//private Map<String, Date> PrimarySchool;
	private String PrimarySchool;
	/*中学*/
	//private Map<String, Date> MiddleSchool;
	private String MiddleSchool;
	/*大学*/
	//private Map<String, Date> College;
	private String College;
	/*图片*/
	//private List<Long> Pic;
	private String Pic;
	/*爱好*/
	//private List<String> Hobbies;
	private String Hobbies;
	/*家庭成员*/
	//private Map<String, String> HomeMembers;
	private String HomeMembers;
	/*家庭成员联系方式*/
	//private Map<String, String> ConnectInfo;
	private String ConnectInfo;
	/*社交账号*/
	//private Map<String, String> SocialAccount;
	private String SocialAccount;
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
	public String getNickName() {
		return NickName;
	}
	public void setNickName(String nickName) {
		NickName = nickName;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getHomeTown() {
		return HomeTown;
	}
	public void setHomeTown(String homeTown) {
		HomeTown = homeTown;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getHome() {
		return Home;
	}
	public void setHome(String home) {
		Home = home;
	}
	public String getCompanyIDCard() {
		return CompanyIDCard;
	}
	public void setCompanyIDCard(String companyIDCard) {
		CompanyIDCard = companyIDCard;
	}
	public String getPrimarySchool() {
		return PrimarySchool;
	}
	public void setPrimarySchool(String primarySchool) {
		PrimarySchool = primarySchool;
	}
	public String getMiddleSchool() {
		return MiddleSchool;
	}
	public void setMiddleSchool(String middleSchool) {
		MiddleSchool = middleSchool;
	}
	public String getCollege() {
		return College;
	}
	public void setCollege(String college) {
		College = college;
	}
	public String getPic() {
		return Pic;
	}
	public void setPic(String pic) {
		Pic = pic;
	}
	public String getHobbies() {
		return Hobbies;
	}
	public void setHobbies(String hobbies) {
		Hobbies = hobbies;
	}
	public String getHomeMembers() {
		return HomeMembers;
	}
	public void setHomeMembers(String homeMembers) {
		HomeMembers = homeMembers;
	}
	public String getConnectInfo() {
		return ConnectInfo;
	}
	public void setConnectInfo(String connectInfo) {
		ConnectInfo = connectInfo;
	}
	public String getSocialAccount() {
		return SocialAccount;
	}
	public void setSocialAccount(String socialAccount) {
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