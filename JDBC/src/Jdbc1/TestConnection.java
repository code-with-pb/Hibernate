package Jdbc1;

import java.sql.*;

public class TestConnection {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC
		System.out.println("1. Driver loaded....");

		// Create Connection [port-db_name , id , pass ]
		DriverManager.getConnection("jdbc:mysql://localhost:3306/gp", "root", "admin");

		System.out.println("2. Connection Created....");
		System.out.println("Thanks");

	}
}
