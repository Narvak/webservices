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
	
	
	
	
	
	
}