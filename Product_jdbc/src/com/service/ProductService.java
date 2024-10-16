package com.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.Model.ProductModel;
import com.dao.ProductDao;

public class ProductService {
	static ProductDao pd = new ProductDao();
	
	public String addProduct(ProductModel pm) throws SQLException {

		return pd.addProduct(pm);
	}
	public String deleteProduct(long ProductId) throws SQLException {
		
		return pd.deleteProduct(ProductId);
	}
	public Object selectProduct(long ProductId) throws SQLException {
		
		return pd.selectProduct(ProductId);
	}
	public String updateProduct(ProductModel pm) throws SQLException {
		
		return pd.updateProduct(pm);
	}
	public Object showAllProduct() throws SQLException {
		
		return pd.showAllProduct();
	}
	public static List<ProductModel> showProduct(String nm)throws SQLException{
		
		return pd.showProduct(nm);
	}
	public static List<ProductModel> InfoProduct(String ProductName) throws SQLException{
		return pd.InfoProduct(ProductName);
	}
	public static List<ProductModel> showOrderProduct(double PrductPrice) throws SQLException{
		return pd.showOrderProduct(PrductPrice);
	}
	public List<ProductModel> showbyPatternNameProduct(String nm) throws SQLException {
		return pd.showbyPatternNameProduct(nm);
	}
	public static List<ProductModel> showProductInRange(double s[]) throws SQLException {
		return pd.showProductInRange(s);
	}
	public double showPriceByNameProduct(String nm) throws SQLException {
		return pd.showPriceByNameProduct(nm);
	}
}
