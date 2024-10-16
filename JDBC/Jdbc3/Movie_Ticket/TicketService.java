package Movie_Ticket;

import java.util.*;
import java.sql.*;

public class TicketService {

	static Connection cn = null;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gp", "root", "admin");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void insert(List<MovieTicket> mt) throws SQLException{
		// TODO Auto-generated method stub
		String sql = "insert into movieticket values (?,?,?,?,?)";
		PreparedStatement ps = cn.prepareStatement(sql);
		int r = 0;
		for(MovieTicket m : mt) {
			ps.setString(1, m.MovieName);
			ps.setString(2, m.time);
			ps.setString(3, m.circle);
			ps.setString(4, m.Category);
			ps.setInt(5, m.price);
			
			ps.executeUpdate();
			r++;
		}
		System.out.println(r+" Rows inserted...");
	}

	public static void display() throws SQLException {
		// TODO Auto-generated method stub
		List<MovieTicket> mt = new ArrayList<>();
		String sql = "select * from movieticket";
		Statement st = cn.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			String mn = rs.getString(1);
			String t = rs.getString(2);
			String c = rs.getString(3);
			String ca = rs.getString(4);
			int p = rs.getInt(5);
			
			MovieTicket mk = new MovieTicket(mn, t, c, ca, p);
			
			mt.add(mk);
		}
		mt.forEach(System.out::println);
	}

	public static void update() throws SQLException {
		// TODO Auto-generated method stub
		List<MovieTicket> mt  = new ArrayList<>();
		String sql = "update movieticket set Duration = '3hr' where Category = '2D'";
		
		Statement st = cn.createStatement();
		
		int r = st.executeUpdate(sql);
		
		System.out.println(r+" rows Updated..");
	}

}
