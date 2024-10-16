package StudentDetail;
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
	public static void display() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from workbench_data";
		List<Student> list = new ArrayList<>();
		Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			float Marks = rs.getFloat(3);
			int year = rs.getInt(4);
			
			Student ss = new Student(id,name,Marks,year);
			list.add(ss);
		}
		list.forEach(System.out::println);
	}

}
