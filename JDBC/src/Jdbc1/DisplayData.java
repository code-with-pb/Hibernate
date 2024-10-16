package Jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayData {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC
		Connection cn = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/gp", "root", "admin");
									// ?autoReconnect=true&useSSL=false
		
		// createStatement
		Statement st = cn.createStatement(); // step 4
		String query = "select * from db_csr";

		ResultSet rs = st.executeQuery(query); // DQL - select
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String role = rs.getString(3);
			float per = rs.getFloat(4);
			System.out.println(id + " , " + name + " , " + role + " , " + per);
		}

	}
}
