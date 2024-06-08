package com.main.jdbc;
import java.sql.*;
public class JDBC {
	
	public static void main(String[] args) {
		// TODO Auto-generated method st
		try {
			
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/hotel";
			String username = "root";
			String password ="0911@fifa2twO";
			
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Established connection");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
