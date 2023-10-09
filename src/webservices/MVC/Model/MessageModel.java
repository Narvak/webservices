package webservices.MVC.Model;

public class MessageModel {
	
	private String name;
	private String phoneNumber;
	private String mail;
	private String society;
	private String objet;
	private String message;
	
	public Message(String name, String phoneNumber, String mail, String society, String objet, String message) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.mail = mail;
		this.society = society;
		this.objet = objet;
		this.message = message;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSociety() {
		return society;
	}

	public void setSociety(String society) {
		this.society = society;
	}

	public String getObjet() {
		return objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
	
}
