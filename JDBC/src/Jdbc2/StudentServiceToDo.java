package Jdbc2;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class StudentServiceToDo {
	static Connection cn = null;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gp","root","admin");
		}catch(Exception e) {
			
		}
	}
	
	
	public static void insertData(List<Student> slist) {
		// TODO Auto-generated method stub
		try {
			String sql = "insert into stdnt values (?,?,?)";
			PreparedStatement ps = cn.prepareStatement(sql);
			int r = 0;
			for(Student s : slist) {
				ps.setInt(1, s.id);
				ps.setString(2, s.name);
				ps.setFloat(3, s.per);
				ps.executeUpdate();
				r++;
			}
			System.out.println(r+" row inserted....");
		}catch(Exception e) {}
	}
	
	
	
	public static void updateData() {
		System.out.println("hiiiiiiiii");
		// TODO Auto-generated method stub
		try {
			System.out.println("Execution start....");
			String sql = "update stdnt set name = 'Pooja' where roll_no = 16";
			Statement st = cn.createStatement();
			
			int r = st.executeUpdate(sql);
			
			System.out.println(r+" Updated SuccessFully...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public static void deleteData() {
		// TODO Auto-generated method stub
		try {
			String sql = "delete from stdnt where roll_no > 9";
			Statement st = cn.createStatement();
			int r = st.executeUpdate(sql);
			System.out.println(r+ " Deleted row...");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


	public static void displayData() {
		// TODO Auto-generated method stub
		try {
			List<Student> slist = new ArrayList<>();
			String sql = "select * from stdnt";
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				float per = rs.getFloat(3);
				Student ss = new Student(id, name, per);
				slist.add(ss);
				//System.out.println(id+" , "+ name + " , "+per);
			}
			slist.forEach(System.out::println);
			System.out.println(" Display SucessFully...");
		}catch(Exception e) {}
		
	}

}
