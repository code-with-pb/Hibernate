package Student_Presenty_Mngt;

import java.sql.*;
import java.util.*;


public class StudentServiceToDo {
	
	static Connection cn = null;
	
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gp","root","admin");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertData(List<Student> slist) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into student values(?,?,?,?)";
		
		PreparedStatement ps = cn.prepareStatement(sql);
		
		int r = 0;
		
		for(Student s : slist) {
			ps.setInt(1, s.rollno);
			ps.setString(2, s.Fnm);
			ps.setString(3, s.lnm);
			ps.setBoolean(4, s.presenty);
			
			ps.executeUpdate();
			r++;
		}
		System.out.println("Inserted SuccessFully....");
	}
	
	public static void display() throws SQLException {

		List<Student>slist = new ArrayList<>();
		String sql = "select * from student";
		java.sql.Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int rollno = rs.getInt(1);
			String Fnm = rs.getString(2);
			String lnm = rs.getString(3);
			boolean presenty = rs.getBoolean(4);
			
			Student ss = new Student(rollno, Fnm, lnm, presenty);
			slist.add(ss);
		}
		slist.forEach(System.out::println);
	}

}
