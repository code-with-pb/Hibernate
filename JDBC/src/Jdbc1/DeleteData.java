package Jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gp", "root", "admin");
		System.out.println("Connection Created....");

		// createStatement
		Statement st = cn.createStatement();  // step 4
		String query = "delete from db_csr where emp_id=444";
				
		int rows = st.executeUpdate(query ) ; // DML - insert,update,delete
		
		System.out.println(rows + " rows deleted .. ");
		
		System.out.println("Thanks");

	}
}
