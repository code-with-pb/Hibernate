package com.prvn;

import java.sql.*;

public class jdbc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gp","root","admin");
			
			Statement st = cn.createStatement();
			
			ResultSet rs = st.executeQuery("select * from stdnt");
			
			while(rs.next()) {
				rs.getInt(1);
			}
			rs.close();
			cn.close();
			
			System.out.println("Connection Establish.....");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
