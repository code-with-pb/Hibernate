package WCT20_CoreJavaProject;

import java.sql.*;
import java.util.*;

public class PlaerServiceToDo {
	static Connection cn = null;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pb","root","admin");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void insert(List<PlayerDao> l) throws SQLException {
		// TODO Auto-generated method stub
		//List<PlayerDao> ls = new LinkedList<>();
		String sql = "insert into player values(?,?,?,?,?,?)";
		PreparedStatement ps = cn.prepareStatement(sql);
		
		int r = 0;
		
		for(PlayerDao lp : l) {
			ps.setInt(1, lp.id);
			ps.setString(2, lp.name);
			ps.setString(3, lp.team_name);
			ps.setString(4, lp.category);
			ps.setInt(5, lp.score);
			ps.setInt(6, lp.noWickets);
			
			ps.executeUpdate();
			r++;
		}
		System.out.println("Inserted...");
	}
	public static void display() throws SQLException {
		// TODO Auto-generated method stub
		List<PlayerDao> ls = new ArrayList<>();
		String sql = "select * from player";
		Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String nm = rs.getString(2);
			String tnm = rs.getString(3);
			String cat = rs.getString(4);
			int s = rs.getInt(5);
			int w = rs.getInt(6);
			
			PlayerDao sp = new PlayerDao(id,nm,tnm,cat,s,w);
			ls.add(sp);
		}
		ls.forEach(System.out::println);
	}

}
