package com.prepareproduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Model.ProductModel;

public class prepareProduct {
	
	
	
	static Scanner sc = new Scanner(System.in);
	static ProductModel pm1 = new ProductModel();
	
	
	
	public static Object PreparedProduct(ProductModel pm) {
		System.out.print("Enter ProductId: ");
		pm.setProductId(sc.nextLong());
		
		System.out.print("Enter ProductName: ");
		pm.setProductName(sc.next());
		
		System.out.print("Enter Product Quantity: ");
		pm.setProductQuanty(sc.nextInt());
		
		System.out.print("Enter Product Price: ");
		pm.setProductPrice(sc.nextDouble());
		
		System.out.print("Enter Mfg Date: ");
		pm.setMfgDate(sc.next());
		
		System.out.print("Enter Exp Date: ");
		pm.setExpDate(sc.next());
		
		return pm;
	}
	
	
	
	public static long deleteByIdProduct(long ProductId) {
		
		System.out.print("Enter ProductId: ");
		pm1.setProductId(sc.nextLong());
		
		return pm1.getProductId();
	}
	
	
	
	public static Object UpdateProduct(ProductModel pm) {
		
		/*System.out.print("Enter Which column You Want to Update: ");
		String nm = sc.next();
		System.out.print("Enter What You Want to Update: ");
		String name = sc.next();*/
		
		System.out.print("1)ById 2)ByName 3)ByQuantity 4)ByPrice 5)Exit: ");
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
		pm.setProductName(sc.next());
		
		return pm;
	}
	
	
	
	public static String showProduct(String name) {
		System.out.print("Enter Col_Name: ");
		name = sc.next();
		
		return name;
	}
	
	
	public static String showByNameProduct(String ProductName){
		
		System.out.print("Enter ProductName: ");
		ProductName = sc.next();
		
		return ProductName;
	}
	
	
	public static double greaterpriceProduct(double pr) {
		
		
		System.out.print("Emter Price: ");
		pr = sc.nextDouble();
		
		return pr;
	}
	
	
	public static String shownameByPatterProduct(String nm) {
		System.out.print("Enter ProductName By Pattern: ");
		nm = sc.next();
		
		return nm;
	}
	public static double [] showProductInRange(double low, double high){
		//List<ProductModel> list = new ArrayList<>();
		System.out.print("Emter Low Price: ");
		low = sc.nextDouble();
		System.out.print("Emter High Price: ");
		high = sc.nextDouble();
		
		return new double[] {low, high};
	}
	public static String showPriceByNameProduct(String ProductName) {
		System.out.print("Enter ProductName: ");
		ProductName = sc.next();
		
		return ProductName;
	}
}
