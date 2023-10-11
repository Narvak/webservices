//package
package webservices;




//import
import java.applet.*;
import java.awt.*;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.security.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import javax.swing.*;




//class
public class Main {
	
	//main class
	public static void main(String args[]) {
		try {
			System.out.println("Start.");
			System.out.println("Webservice is open.");
			
				//execution of static primary and secondary class.
				primary();
				secondary();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	
	//primary class and is not the main class.
	public static void primary() {
		try {
			System.out.println("Primary start.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	
	//secondary class.
	public static void secondary() {
		try {
			System.out.println("Secondary start.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	
}