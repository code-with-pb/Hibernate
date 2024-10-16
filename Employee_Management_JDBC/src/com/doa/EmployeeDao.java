package com.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.connectionconfig.ConnectionJDBC;
import com.employeedb.Employees;

public class EmployeeDao {
	
	static String sql = null;
	static Employees ed = new Employees();
	
	public static String addEmployee(String datetime) {
		
		ConnectionJDBC con = new ConnectionJDBC();
		int date= Integer.parseInt(datetime);
		
		try {
			Connection cn = con.connect();
			sql = "insert into employeedb values(?,?,?,?,?,?,?)";
			PreparedStatement ps = cn.prepareStatement(sql);
			
			ps.setLong(1, date);
			ps.setString(2, ed.getFirstName());
			ps.setString(3, ed.getLastName());
			ps.setString(4, ed.getDepartment());
			ps.setString(5, ed.getJobTitle());
			ps.setDouble(6, ed.getSalary());
			ps.setString(7, ed.getHireDate());
			
			int i = ps.executeUpdate();
			
			if(i == 0) {
				return "Data Not Inserted...";
			}
			return "Data Inserted...";
		} catch (ClassNotFoundException e) {
			return "ClassNotFoundException";
			
		}
		catch(SQLException e) {
			e.printStackTrace();
			return "SQLException";
		}
		
		
	}
}
