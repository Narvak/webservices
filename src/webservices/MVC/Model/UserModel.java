package webservices.MVC.Model;

public class UserModel {
	private String name;
	private String firstName;
	private String userName;
	private String mail;
	private String city;
	private String zipCode;
	private String contry;
	private String road;
	private String age;
	private String birthday;
	//private String role; //user, modo, admin,
	
	
	public User(String name, String firstName, String userName, String mail, String city, String zipCode, String contry, String road, String age, String birthday) {
		this.name = name;
		this.firstName = firstName;
		this.userName = userName;
		this.mail = mail;
		this.city = city;
		this.zipCode = zipCode;
		this.contry = contry;
		this.road = road;
		this.age = age;
		this.birthday = birthday;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getContry() {
		return contry;
	}


	public void setContry(String contry) {
		this.contry = contry;
	}


	public String getRoad() {
		return road;
	}


	public void setRoad(String road) {
		this.road = road;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	
	
	
	
}