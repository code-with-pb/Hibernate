package com.Scanner_29;

import java.util.*;

public class Program1 {
	public static void swapping() {
		int a;
		int b;
		int t;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A: ");
		a = sc.nextInt();
		
		System.out.print("Enter B: ");
		b = sc.nextInt();
		
		System.out.println("A = "+a+" B = "+b);
		
		t = a;
		a = b;
		b = t;
		
		System.out.println("A = "+a+" B = "+b);
	}

	public static void swap() {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter A: ");
		a = sc.nextInt();
		
		System.out.print("Enter B: ");
		b = sc.nextInt();
		
		System.out.println("A = "+a+" B = "+b);
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("A = "+a+" B = "+b);
		
	}
}
