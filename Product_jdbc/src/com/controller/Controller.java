package com.controller;

import com.config.Connectionconfig;
import com.prepareproduct.prepareProduct;
import com.service.ProductService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Model.ProductModel;

public class Controller {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ProductService ps = new ProductService();
		
		ProductModel pm = new ProductModel();
		
		//Scanner sc = new Scanner(System.in);
		/*System.out.print("Enter ProductId: ");
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
		pm.setExpDate(sc.next());   //He Run Kel tari run hotay
		
		ProductModel pm1 = new ProductModel(pm.getProductId(),pm.getProductName(),pm.getProductQuanty(),pm.getProductPrice(),pm.getMfgDate(),pm.getExpDate());
		
		*/
		String sql;
		Scanner sc = new Scanner(System.in);
		Object pp;
		String name = null;
		String nm = null;
		int n;
		do {
			System.out.println("1)addProduct 2)deleteByProductID 3)selectProduct 4)showAll 5)UpdateProduct 6)Exit");
			System.out.print("Enter Choice: ");
			n = sc.nextInt();
			switch(n) {
				case 1:
					pp = prepareProduct.PreparedProduct(pm);
					
					sql = ps.addProduct(pm);
					
					System.out.println(sql);
					break;
				case 2:
					pp = prepareProduct.deleteByIdProduct(pm.getProductId());
					
					String d = ps.deleteProduct((long)pp);
					
					System.out.println(d);
					break;
				case 3:
					Object pss = ps.selectProduct(pm.getProductId());
					
					System.out.println(pss);
					break;
				case 4:
					Object showall = ps.showAllProduct();
					
					System.out.println(showall);
					break;
				case 5:
					pp = prepareProduct.UpdateProduct(pm);
					
					ProductModel pm1 = new ProductModel(pm.getProductId(),pm.getProductName());
					
					String up = ps.updateProduct(pm1);
					
					System.out.println(up);
					break;
				case 6:
					
					//List<ProductModel> pm3 = new ArrayList<>();
					nm = prepareProduct.showProduct(name);
					
					List<ProductModel> list = ps.showProduct(nm);
			
					System.out.println(list);
					
					break;
				case 7:
					nm = prepareProduct.showByNameProduct(name);
					List<ProductModel> pm3 = ps.InfoProduct(nm);
					
					System.out.println(pm3);
					break;
				case 8:
					double price = 0.0d;
					double pr = prepareProduct.greaterpriceProduct(price);
					
					List<ProductModel> p = ps.showOrderProduct(pr);
					
					System.out.println(p);
					break;
					
				case 9:
					nm = prepareProduct.shownameByPatterProduct(name);
					List<ProductModel> pm5 = ps.showbyPatternNameProduct(nm);
					
					System.out.println(pm5);
					break;
				case 10:
					int low = 0;
					int high = 0;
					double a[] = new double[2];
					a = prepareProduct.showProductInRange(low,high); 
					List<ProductModel> pm6 = ps.showProductInRange(a);
					
					System.out.println(pm6);
					break;
				case 11:
			
					String Max = prepareProduct.showPriceByNameProduct(nm);
					double max = ps.showPriceByNameProduct(Max);
					
					System.out.println(max);
				case 12:
					System.out.println("Thank You...");
					break;	
			}
			
		}while(n != 12);

		/*
		
		Object pp;
		
		*/
		
		/*
		
		*/
		
		
		
		
	}

}
