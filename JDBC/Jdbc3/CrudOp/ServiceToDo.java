package CrudOp;

import java.util.*;
import java.sql.*;

public class ServiceToDo {
	static Connection cn = null;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pb","root","admin");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void insert(List<CrudOp1> list) throws SQLException {
		// TODO Auto-generated method stub
		
		String sql = "insert into workbench_data values(?,?,?,?)";
		
		PreparedStatement ps = cn.prepareStatement(sql);
		int i = 0;
		
		for(CrudOp1 cs : list) {
			ps.setInt(1, cs.id);
			ps.setString(2, cs.Name);
			ps.setFloat(3, cs.marks);
			ps.setInt(4, cs.y);
			
			i++;
			
			ps.executeUpdate();
		}
		System.out.println(i+" rows Inserted...");
	}

	public static void update() throws SQLException {
		// TODO Auto-generated method stub
		List<CrudOp1>list = new ArrayList<>();
		
		String sql = "Update workbench_data set Name = 'Rahul Tambe' where Id = 3";
		
		Statement st = cn.createStatement();
		
		int i = st.executeUpdate(sql);
		
		System.out.println(i);
	}

	public static void delete() throws SQLException {
		// TODO Auto-generated method stub
		List<CrudOp1> list = new ArrayList<>();
		
		String sql = "delete from workbench_data where Id = 5";
		
		Statement st = cn.createStatement();
		
		int i = st.executeUpdate(sql);
		
		System.out.println(i);
	}

	public static void display() throws SQLException {
		// TODO Auto-generated method stub
		List<CrudOp1> list = new ArrayList<>();
		
		String sql = "select * from workbench_data";
		
		Statement st = cn.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String nm = rs.getString(2);
			float m = rs.getFloat(3);
			int year = rs.getInt(4);
			
			CrudOp1 p = new CrudOp1(id,nm,m,year);
			
			list.add(p);
		}
		list.forEach(System.out::println);
	}

}
