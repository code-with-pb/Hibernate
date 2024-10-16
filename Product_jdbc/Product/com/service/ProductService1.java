package com.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.Model.ProductModel1;
import com.dao.ProductDao1;

public class ProductService1 {
	static ProductDao1 pd = new ProductDao1();
	
	public String addProduct(ProductModel1 pm) throws SQLException {

		return pd.addProduct(pm);
	}
	public String deleteProduct(long ProductId) throws SQLException {
		
		return pd.deleteProduct(ProductId);
	}
	public Object selectProduct(long ProductId) throws SQLException {
		
		return pd.selectProduct(ProductId);
	}
	public String updateProduct(ProductModel1 pm) throws SQLException {
		
		return pd.updateProduct(pm);
	}
	public Object showAllProduct() throws SQLException {
		
		return pd.showAllProduct();
	}
	public static List<ProductModel1> showProduct(String nm)throws SQLException{
		
		return pd.showProduct(nm);
	}
	public static List<ProductModel1> InfoProduct(String ProductName) throws SQLException{
		return pd.InfoProduct(ProductName);
	}
	public static List<ProductModel1> showOrderProduct(double PrductPrice) throws SQLException{
		return pd.showOrderProduct(PrductPrice);
	}
	public List<ProductModel1> showbyPatternNameProduct(String nm) throws SQLException {
		return pd.showbyPatternNameProduct(nm);
	}
	public static List<ProductModel1> showProductInRange(double s[]) throws SQLException {
		return pd.showProductInRange(s);
	}
	public double showPriceByNameProduct(String nm) throws SQLException {
		return pd.showPriceByNameProduct(nm);
	}
}
