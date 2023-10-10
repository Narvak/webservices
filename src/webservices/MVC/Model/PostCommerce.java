//package
package webservices.MVC.Model;




//import
import java.applet.*;
import java.awt.*;
import java.io.*;
//import java.lang.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.security.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.swing.*;




//class
public class PostCommerce {
	
	
	private String title;
	private String categorie;
	private String description;
	private String price;
	//private Image;
	private String commentaire;
	
	public PostCommerce(String title, String categorie, String description, String price, String commentaire) {
		this.title = title;
		this.categorie = categorie;
		this.description = description;
		this.price = price;
		this.commentaire = commentaire;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCategorie() {
		return categorie;
	}
	
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getCommentaire() {
		return commentaire;
	}
	
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	
	
	
	
	
}
