package
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
public class MessageCommentaires {
	
	private String name;
	private String message;
	
	public MessageCommentaires(String name, String message) {
		this.name = name;
		this.message = message;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
}
