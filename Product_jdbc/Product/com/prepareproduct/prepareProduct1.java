package com.prepareproduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Model.ProductModel1;

public class prepareProduct1 {
	
	
	
	static Scanner sc = new Scanner(System.in);
	static ProductModel1 pm1 = new ProductModel1();
	
	
	
	public static Object PreparedProduct(ProductModel1 pm) {
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
	
	
	
	public static long deleteByIdProduct() {
		
		System.out.print("Enter ProductId: ");
		pm1.setProductId(sc.nextLong());
		
		return pm1.getProductId();
	}
	
	
	public static long selectProduct() {
		
		System.out.print("Enter ProductId: ");
		pm1.setProductId(sc.nextLong());
		
		return pm1.getProductId();
	}
	
	
	
	public static Object UpdateProduct(ProductModel1 pm) {
		
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
		
		return pm;
	}
	
	
	
	public static String showProduct() {
		System.out.print("Enter Col_Name: ");
		String name = sc.next();
		
		return name;
	}
	
	
	public static String showByNameProduct(){
		
		System.out.print("Enter ProductName: ");
		pm1.setProductName(sc.next());
		
		return pm1.getProductName();
	}
	
	
	public static double greaterpriceProduct() {
		
		
		System.out.print("Emter Price: ");
		pm1.setProductPrice(sc.nextDouble());;

		return pm1.getProductPrice();
	}
	
	
	public static String shownameByPatterProduct() {
		System.out.print("Enter ProductName By Pattern: ");
		pm1.setProductName(sc.next());
		
		return pm1.getProductName();
	}
	public static double [] showProductInRange(double low, double high){
		//List<ProductModel> list = new ArrayList<>();
		System.out.print("Emter Low Price: ");
		low = sc.nextDouble();
		System.out.print("Emter High Price: ");
		high = sc.nextDouble();
		
		return new double[] {low, high};
	}
	public static String showPriceByNameProduct() {
		System.out.print("Enter ProductName: ");
		pm1.setProductName(sc.next());
		
		return pm1.getProductName();
	}
}
