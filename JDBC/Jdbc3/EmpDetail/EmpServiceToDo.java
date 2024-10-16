package EmpDetail;

import java.util.*;
import java.sql.*;


public class EmpServiceToDo {
	
	static Connection cn = null;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gp","root","admin");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void insert(List<Employee> elist) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "insert into empd values(?,?,?)";
		
		PreparedStatement ps = cn.prepareStatement(sql);
		int r = 0;
		
		for(Employee e : elist) {
			ps.setInt(1, e.id);
			ps.setString(2, e.nm);
			ps.setDouble(3, e.sal);
			
			ps.executeUpdate();
			r++;
		}
		System.out.println(r+" row inserted...");
	}
	public static void Display() throws SQLException{
		// TODO Auto-generated method stub
		List<Employee> elist = new ArrayList<>();
		String sql = "select * from empd";
		Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String nm = rs.getString(2);
			double sal = rs.getDouble(3);
			
			Employee ee = new Employee(id, nm, sal);
			elist.add(ee);
		}
		elist.forEach(System.out::println);
	}
	public static void update() throws SQLException{
		// TODO Auto-generated method stub
		
		List<Employee> elist = new ArrayList<>();
		String sql = "update empd set sal = ? where id = ?";
		
		PreparedStatement ps = cn.prepareStatement(sql);
		
		for(Employee e : elist) {
			ps.setInt(1, e.id);
			ps.setDouble(3, e.sal);
			ps.executeUpdate();
		}
		System.out.println("Updated.....");
	}
}
