package Task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServiceToDo {
	static Connection cn = null;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/KiranAcademy","root","admin");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Insert(List<Student> list) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "insert into student values(?,?,?,?,?,?)";
		PreparedStatement ps = cn.prepareStatement(sql);
		int i=0;
		
		for(Student s : list) {
			ps.setInt(1, s.id);
			ps.setString(2, s.fnm);
			ps.setString(3, s.lnm);
			ps.setString(4, s.dob);
			ps.setString(5, s.No);
			ps.setDouble(6, s.fees);
			
			i++;
			
			ps.executeUpdate();
		}
		System.out.println(i+" rows Affected...");
	}

	public static void DisplayAll() throws SQLException{
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		String sql = "select * from student";
		Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		int i = 0;
		while(rs.next()) {
			int id = rs.getInt(1);
			String fnm = rs.getString(2);
			String lnm = rs.getString(3);
			String dob = rs.getString(4);
			String no = rs.getString(5);
			double fee = rs.getDouble(6);
			
			i++;
			
			Student s = new Student(id,fnm,lnm,dob,no,fee);
			
			list.add(s);
		}
		list.forEach(System.out::println);
		System.out.println(i+" rows Affected...");
	}

	public static void UpdateById(List<Student> list2) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "update student set First_Name = ?, Last_Name = ? where Id = ?";
		
		PreparedStatement ps = cn.prepareStatement(sql);
		int i = 0;
		
		for(Student s : list2) {
			ps.setInt(1, s.id);
			ps.setString(2, s.fnm);
			ps.setString(3, s.lnm);
			
			i++;
			
			ps.executeUpdate();
		}
		System.out.println(i+" rows Affected...");
	}

}
