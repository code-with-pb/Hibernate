package Task1;

import java.util.*;
import java.sql.*;

public class ServiceToDo {
	static Connection cn = null;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pb","root","admin");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void insert(List<CRUD> list1) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "Insert into workbench_data values (?,?,?,?)";
		PreparedStatement ps = cn.prepareStatement(sql);
		int i=0;
		
		for(CRUD p : list1) {
			ps.setInt(1, p.Id);
			ps.setString(2, p.Name);
			ps.setFloat(3, p.Marks);
			ps.setInt(4, p.Year);
			
			i++;
			
			ps.executeUpdate();
		}
		System.out.println(i+" rows inserted...");
	}

	public static void UpdateNameById(List<CRUD> list2) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "update workbench_data set Name = ? where Id = ?";
		PreparedStatement ps = cn.prepareStatement(sql);
		int i = 0;
		for(CRUD p : list2) {
			ps.setInt(1, p.Id);
			ps.setString(2, p.Name);
			
			i++;
			
			ps.executeUpdate();
		}
		System.out.println(i+" rows Updated...");
	}

	public static void UpdateNameMarksById(List<CRUD> list3) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "update workbench_data set Name = ?, Marks = ? where Id = ?";
		PreparedStatement ps = cn.prepareStatement(sql);
		int i = 0;
		for(CRUD p : list3) {
			ps.setInt(1, p.Id);
			ps.setString(2, p.Name);
			ps.setFloat(3, p.Marks);
			
			i++;
			
			ps.executeUpdate();
		}
		System.out.println(i+" rows Updated...");
	}

	public static void DeleteById(List<CRUD> list4) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "Delete from workbench_data where Id = ?";
		PreparedStatement ps = cn.prepareStatement(sql);
		int i = 0;
		for(CRUD p : list4) {
			ps.setInt(1, p.Id);
			
			i++;
			
			ps.executeUpdate();
		}
		System.out.println(i+" rows Deleted...");
	}

	public static void DisplayById(int c2) throws SQLException{
		// TODO Auto-generated method stub
		
		List<CRUD> list = new ArrayList<>();
		String sql = "select * from workbench_data where id = ?";
		
		PreparedStatement ps = cn.prepareStatement(sql);
		int i=0;
		CRUD p = new CRUD(c2);
		//for(CRUD p: list5) {
			ps.setInt(1, p.Id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String nm = rs.getString(2);
				float m = rs.getFloat(3);
				int y = rs.getInt(4);
				
				CRUD c = new CRUD(id,nm,m,y);
				
				list.add(c);
			}
			
		//}
		list.forEach(System.out::println);
	}

	public static void DisplayAllRecord() throws SQLException{
		// TODO Auto-generated method stub
		List<CRUD> list = new ArrayList<>();
		String sql = "select * from workbench_data";
		
		Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String nm = rs.getString(2);
			float m = rs.getFloat(3);
			int y = rs.getInt(4);
			
			CRUD c = new CRUD(id,nm,m,y);
			
			list.add(c);
		}
		list.forEach(System.out::println);
	}

	public static void DisplayRangeRecord(float mark) throws SQLException{
		// TODO Auto-generated method stub
		List<CRUD> list = new ArrayList<>();
		
		String sql = "select * from workbench_data where marks >= ?";
		
		PreparedStatement ps = cn.prepareStatement(sql);
		
		CRUD p = new CRUD(mark);
		
		int i = 0;
		
		ps.setFloat(1, p.Marks);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			float ma = rs.getFloat(3);
			int y = rs.getInt(4);
			i++;
			CRUD c = new CRUD(id,name,ma,y);
			
			list.add(c);
		}
		list.forEach(System.out::println);
	}

}
