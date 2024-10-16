package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Model.ProductModel;
import com.config.Connectionconfig;

public class ProductDao {
	
	static Scanner sc = new Scanner(System.in);
	static String sql;
	static Connection cn = Connectionconfig.getConnection();
	ProductModel pm = new ProductModel();
	
	public String addProduct(ProductModel pm) throws SQLException {
		
		sql = "insert into product values(?,?,?,?,?,?)";
		PreparedStatement ps = cn.prepareStatement(sql);
		
		ps.setLong(1, (long) pm.getProductId());
		ps.setString(2, (String) pm.getProductName());
		ps.setInt(3, (int)pm.getProductQuanty());
		ps.setDouble(4, (double)pm.getProductPrice());
		ps.setString(5, (String)pm.getMfgDate());
		ps.setString(6, (String)pm.getExpDate());
		
		int i = ps.executeUpdate();
		
		if(i == 0) {
			return "Data Not Inserted...";
		}
		
		return "Data Inserted Successfully...";
	}
	public String deleteProduct(long ProductId) throws SQLException {
		
		
		/*System.out.print("Enter ProductId: ");
		pm.setProductId(sc.nextLong());*/
		
		System.out.println(ProductId);

		sql = "Delete from product where productid = ?";
		
		PreparedStatement ps = cn.prepareStatement(sql);
		
		ps.setLong(1, ProductId);
		
		int i = ps.executeUpdate();
		
		if(i == 0) {
			return "Data Not Deleted...";
		}
		return "Data Deleted Successfully...";
	}
	public Object selectProduct(long ProductId) throws SQLException {
		
		List<ProductModel> list = new ArrayList<>();
		
		System.out.print("Enter ProductId: ");
		pm.setProductId(sc.nextLong());
		
		sql = "select * from product where ProductId = ?";
		PreparedStatement ps = cn.prepareStatement(sql);
		
		ProductModel pm3 = new ProductModel(ProductId);
		
		ps.setLong(1, pm.getProductId());
		
		ResultSet rs = ps.executeQuery();
		
		int i = 0;
		
		while(rs.next()) {
			long Id = rs.getLong(1);
			String ProductName = rs.getString(2);
			int quantity = rs.getInt(3);
			double price = rs.getDouble(4);
			String mfgDate = rs.getString(5);
			String expDate = rs.getString(5);
			
			ProductModel pm1 = new ProductModel(Id,ProductName,quantity,price,mfgDate,expDate);
			i++;
			list.add(pm1);
		}
		
		if(i == 0) {
			return "abc";
		}		
		return list;
	}
	public String updateProduct(ProductModel pm) throws SQLException {
		
		/*System.out.print("Enter Which column You Want to Update: ");
		String nm = sc.next();
		System.out.print("Enter What You Want to Update: ");
		String name = sc.next();*/
		
		/*System.out.print("1)ById 2)ByName 3)ByQuantity 4)ByPrice 5)Exit: ");
		int n = sc.nextInt();
		
		switch(n) {
			case 1:
				System.out.print("Enter ProductId: ");
				pm.setProductId(sc.nextLong());
				break;
			case 2:
				System.out.print("Enter ProductName: ");
				pm.setProductName(sc.next());
				break;
			case 3:
				System.out.print("Enter Product Quantity: ");
				pm.setProductQuanty(sc.nextInt());
				break;
			case 4:
				System.out.print("Enter Product Price: ");
				pm.setProductPrice(sc.nextDouble());
				break;
			default:
				System.out.println("Thank You...");
				break;
		}
		
		
		
		System.out.print("Enter ProductName: ");
		pm.setProductName(sc.next());*/
		
		long id =  pm.getProductId();
		String nae = pm.getProductName();
		
		sql = "update product set ProductName = 'Dell' where ProductId = ?";
		
		PreparedStatement ps = cn.prepareStatement(sql);
		
		
		ps.setLong(1, id);
		//ps.setString(2, nae);
		
		
		int i = ps.executeUpdate();
		
		if(i == 0) {
			return "Not Updated";
		}
		return "Updated Successfully...";
	}
	public Object showAllProduct() throws SQLException {
		
		List<ProductModel> pl = new ArrayList<>();
		
		sql = "select * from product";
		Statement st = cn.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		
		int is = 0;
		
		while(rs.next()) {
			long i = rs.getLong(1);
			String nm = rs.getString(2);
			int quant = rs.getInt(3);
			double price = rs.getDouble(4);
			String mgd = rs.getString(5);
			String exp = rs.getString(6);
			is++;
			ProductModel pm1 = new ProductModel(i,nm,quant,price,mgd,exp);
			
			pl.add(pm1);
		}
		if(is == 0) {
			return "No Data";
		}
		else if(is > 0) {
			return pl;
		}
		System.out.println();
		return "Error";
	}
	public static List<ProductModel> showProduct(String name) throws SQLException{
		
		List<ProductModel > list = new ArrayList<>();
		
		/*System.out.print("Enter Order Parameter: ");
		name = sc.next();*/
		
		sql = ("select * from product order by "+name+" asc");
		
		Statement st = cn.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			long id = rs.getLong(1);
			String nm = rs.getString(2);
			int qty = rs.getInt(3);
			double pr = rs.getDouble(4);
			String mfg = rs.getString(5);
			String exp = rs.getString(6);
			
			ProductModel pm = new ProductModel(id,nm,qty,pr,mfg,exp);
			
			list.add(pm);
		}
		
		return list;		
	}
	public static List<ProductModel> InfoProduct(String ProductName) throws SQLException{
		sql =  "select * from product where ProductName = ?";
		
		List<ProductModel> list = new ArrayList<>();
		
		PreparedStatement ps = cn.prepareStatement(sql);
		
		ps.setString(1, ProductName);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			long id = rs.getLong(1);
			String nm = rs.getString(2);
			int qty = rs.getInt(3);
			double pr = rs.getDouble(4);
			String mfg = rs.getString(5);
			String exp = rs.getString(6);
			
			ProductModel pm4 = new ProductModel(id,nm,qty,pr,mfg,exp);
			
			list.add(pm4);
		}
		
		return list;
	}
	public static List<ProductModel> showOrderProduct(double PrductPrice) throws SQLException{
		List<ProductModel> list = new ArrayList<>();
		
		sql = "select * from product where ProductPrice > ?";
		PreparedStatement ps = cn.prepareStatement(sql);
		
		ps.setDouble(1, PrductPrice);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			long id = rs.getLong(1);
			String nm = rs.getString(2);
			int qty = rs.getInt(3);
			double pr = rs.getDouble(4);
			String mfg = rs.getString(5);
			String exp = rs.getString(6);
			
			ProductModel pm4 = new ProductModel(id,nm,qty,pr,mfg,exp);
			
			list.add(pm4);
		}
		
		return list;
	}
	public List<ProductModel> showbyPatternNameProduct(String nm) throws SQLException {
		List<ProductModel> list = new ArrayList<>();
		
		sql = "select * from product where ProductName like ?";
		
		PreparedStatement ps = cn.prepareStatement(sql);
		
		ps.setString(1, nm);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			long id = rs.getLong(1);
			String name = rs.getString(2);
			int qty = rs.getInt(3);
			double pr = rs.getDouble(4);
			String mfg = rs.getString(5);
			String exp = rs.getString(6);
			
			ProductModel pm4 = new ProductModel(id,name,qty,pr,mfg,exp);
			
			list.add(pm4);
		}
		return list;		
	}
	public static List<ProductModel> showProductInRange(double l[]) throws SQLException {
		
		List<ProductModel> list = new ArrayList<>();
		
		sql = "select * from product where ProductPrice between ? And ?";
		PreparedStatement ps = cn.prepareStatement(sql);
		
		//double a[] = new double[6];
		
	/*	for(ProductModel p : list) {
			a[p] = (double)(p);
		}*/
		
		double pp = l[0];
		double h = l[1];



		
		
		ps.setDouble(1,pp);
		ps.setDouble(2, h);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			long id = rs.getLong(1);
			String name = rs.getString(2);
			int qty = rs.getInt(3);
			double pr = rs.getDouble(4);
			String mfg = rs.getString(5);
			String exp = rs.getString(6);
			
			ProductModel p = new ProductModel(id,name,qty,pr,mfg,exp);
			
			System.out.println(p);
			System.out.println(1);
			
			list.add(p);
			
			System.out.println(list);
			System.out.println(2);
		}
		System.out.println(list);
		System.out.println(3);
		
		return list;
	}
	public static double showPriceByNameProduct(String ProductName) throws SQLException {
		
		sql = "select max(ProductPrice) from product where ProductName = ?";
		
		PreparedStatement ps = cn.prepareStatement(sql);
		
		ps.setString(1, ProductName);
		
		ResultSet rs = ps.executeQuery();
		double maxprice = 0d;
		if(rs.next()) {
			maxprice = rs.getDouble(1);
		}
		
		return maxprice;
	}
}
