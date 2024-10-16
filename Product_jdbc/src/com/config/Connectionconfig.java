package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionconfig {
	public static Connection getConnection() {
		Connection cn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/184db?createDatabaseIfNotExist=true","root","admin");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cn;
		
	}
}
