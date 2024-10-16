package employee_mgt_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpServiceToDao {
	static Connection cn = null;
	static {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gp", "root", "admin");
			System.out.println("Connection created...'");
		} catch (Exception e) {
		}
	}

	public static void insertData(List<Employee> empList) {
		
		//System.out.println("insertData -starts ");
		try {

			String query = "insert into db_csr values(?,?,?,?)";
			PreparedStatement pst = cn.prepareStatement(query); // step 4
			int rows = 0;
			for (Employee s : empList) {
				pst.setInt(1, s.emp_id);
				pst.setString(2, s.name);
				pst.setString(3, s.role);
				pst.setDouble(4, s.salary);
				pst.executeUpdate(); // DML - insert,update,delete
				rows++;
				//System.out.println("***" + rows);
			}

			System.out.println(rows + " rows inserted .. ");
		} catch (Exception e) {

		}
		//System.out.println("insertData -ends ");
	}

	public static void updateData() {
		// TODO Auto-generated method stub

	}

	public static void deleteData() {
		// TODO Auto-generated method stub

	}

	public static void displayData() {
		//System.out.println("*displayData starts*");
		try {
			List<Employee> empList = new ArrayList<>();
			Statement st = cn.createStatement(); // step 4
			String query = "select * from db_csr";
			ResultSet rs = st.executeQuery(query); // DQL - select
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String role = rs.getString(3);
				double sal = rs.getDouble(4);
				Employee ss = new Employee(id, name, role , sal);
				empList.add(ss);
			}
			empList.forEach(System.out::println);
		} catch (Exception e) {
		}
		//System.out.println("display ends");
	}
}
