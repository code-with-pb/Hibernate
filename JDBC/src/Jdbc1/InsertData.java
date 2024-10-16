package Jdbc1;

import java.sql.*;

public class InsertData {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gp", "root", "admin");
		System.out.println("Connection Created....");

		// createStatement
		Statement st = cn.createStatement();  // step 4
		String query = "insert into db_csr values (1,'AKKI','CSE',565555.7)";
				
		int rows = st.executeUpdate(query ) ; // DML - insert,update,delete
		
		System.out.println(rows + " rows inserted .. ");
		
		System.out.println("Thanks");

	}
}
