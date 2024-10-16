package Jdbc1;

import java.sql.*;

public class UpdateData {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gp", "root", "admin");
		System.out.println("Connection Created....");

		// createStatement
		Statement st = cn.createStatement();  // step 4
		String query = "update db_csr set name = 'Akash' where emp_id=555";
				
		int rows = st.executeUpdate(query ) ; // DML - insert,update,delete
		
		System.out.println(rows + " rows updated .. ");
		
		System.out.println("Thanks");

	}
}
