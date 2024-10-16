package com.controller;

import com.config.Connectionconfig1;
import com.prepareproduct.prepareProduct1;
import com.service.ProductService1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Model.ProductModel1;

public class Controller1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ProductService1 ps = new ProductService1();
		
		ProductModel1 pm = new ProductModel1();
		
		String sql;
		Scanner sc = new Scanner(System.in);
		Object pp;
		String nm = null;
		int n;
		do {
			System.out.println("1)addProduct 2)deleteByProductID 3)selectProduct 4)showAll 5)UpdateProduct 6)Exit");
			System.out.print("Enter Choice: ");
			n = sc.nextInt();
			switch(n) {
				case 1:
					pp = prepareProduct1.PreparedProduct(pm);
					
					sql = ps.addProduct(pm);
					
					System.out.println(sql);
					break;
				case 2:
					pp = prepareProduct1.deleteByIdProduct();
					
					String d = ps.deleteProduct((long)pp);
					
					System.out.println(d);
					break;
				case 3:
					
					pp = prepareProduct1.selectProduct();
					
					Object pss = ps.selectProduct((long)pp);
					
					System.out.println(pss);
					break;
				case 4:
					Object showall = ps.showAllProduct();
					
					System.out.println(showall);
					break;
				case 5:
					pp = prepareProduct1.UpdateProduct(pm);
					
					ProductModel1 pm1 = new ProductModel1(pm.getProductId(),pm.getProductName());
					
					String up = ps.updateProduct(pm1);
					
					System.out.println(up);
					break;
				case 6:
					
					//List<ProductModel> pm3 = new ArrayList<>();
					nm = prepareProduct1.showProduct();
					
					List<ProductModel1> list = ps.showProduct(nm);
			
					System.out.println(list);
					
					break;
				case 7:
					nm = prepareProduct1.showByNameProduct();
					List<ProductModel1> pm3 = ps.InfoProduct(nm);
					
					System.out.println(pm3);
					break;
				case 8:
					double price = 0.0d;
					double pr = prepareProduct1.greaterpriceProduct();
					
					List<ProductModel1> p = ps.showOrderProduct(pr);
					
					System.out.println(p);
					break;
					
				case 9:
					nm = prepareProduct1.shownameByPatterProduct();
					List<ProductModel1> pm5 = ps.showbyPatternNameProduct(nm);
					
					System.out.println(pm5);
					break;
				case 10:
					int low = 0;
					int high = 0;
					double a[] = new double[2];
					a = prepareProduct1.showProductInRange(low,high); 
					List<ProductModel1> pm6 = ps.showProductInRange(a);
					
					System.out.println(pm6);
					break;
				case 11:
			
					String Max = prepareProduct1.showPriceByNameProduct();
					double max = ps.showPriceByNameProduct(Max);
					
					System.out.println(max);
				case 12:
					System.out.println("Thank You...");
					break;	
			}
			
		}while(n != 12);
		
	}

}
