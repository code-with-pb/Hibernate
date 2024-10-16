package com.scanner;

import java.util.*;


public class Add {
	public static Scanner sc = new Scanner(System.in);
	public void add() {
		
		System.out.print("Enter A value: ");
		int a = sc.nextInt();
		System.out.print("Enter B value: ");
		int b = sc.nextInt();
		
		int c = a + b;
		
		System.out.println(c);
	}

	public static void sub() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A value: ");
		int a = sc.nextInt();
		System.out.print("Enter B value: ");
		int b = sc.nextInt();
		
		int c = a - b;
		
		System.out.println(c);
	}

	public static void RectangleArea() {
		// TODO Auto-generated method stub
		int l,w;
		System.out.print("Enter Length of Rectangle: ");
		l = sc.nextInt();
		System.out.print("Enter Width of Rectangle: ");
		w = sc.nextInt();
		
		int a = l * w;
		
		System.out.println("Area of Rectangle: "+a);
	}

	public static void circleArea() {
		// TODO Auto-generated method stub
		float pi = 3.14f;
		int r;
		
		System.out.print("Enter Radius of Circle: ");
		r = sc.nextInt();
		
		double a = pi * r * r;
		
		System.out.println("Area of Circle: "+a);
	}

	public static void SimpleInterest() {
		// TODO Auto-generated method stub
		long p,r,t;
		double a;
		
		System.out.print("Enter initial Principal balance: ");
		p = sc.nextLong();
		System.out.print("Enter annual Interest Rate: ");
		r = sc.nextLong();
		System.out.print("Enter time in (Y): ");
		t = sc.nextLong();
		
		a = (p*(1 + r*t))/100;
		
		System.out.println("Simple Interest (S.I): "+a);
	}

	public static void Marks() {
		// TODO Auto-generated method stub
		System.out.print("Enter Sub1 Mark: ");
		float s1 = sc.nextFloat();
		System.out.print("Enter Sub2 Mark: ");
		float s2 = sc.nextFloat();
		System.out.print("Enter Sub3 Mark: ");
		float s3 = sc.nextFloat();
		System.out.print("Enter Sub4 Mark: ");
		float s4 = sc.nextFloat();
		System.out.print("Enter Sub5 Mark: ");
		float s5 = sc.nextFloat();
		
		double sum = s1+s2+s3+s4+s5;
		
		float avg = (float)sum / 5;
		
		float per = ((float)sum * 100)/500;
		
		System.out.println("Average Marks: "+avg);
		
		System.out.println("Percetange: "+per);
		
		
	}

	public static void AreaCone() {
		// TODO Auto-generated method stub
		float pi = 3.14f;
		int r,h;
		System.out.print("Enter radius of Cone: ");
		r = sc.nextInt();
		System.out.print("Enter height of Cone: ");
		h = sc.nextInt();
		
		double a = pi*(r*r)*h/3;
		
		System.out.println("Voulume of Cone: "+a);
	}

	public static void CtoF() {
		// TODO Auto-generated method stub
		System.out.print("Enter Celcius: ");
		int c = sc.nextInt();
		
		double f = (c * 9/5);
		
		System.out.println("Fahrenheit: "+f);
	}

	public static void FtoC() {
		// TODO Auto-generated method stub
		System.out.print("Enter Fahrenheit: ");
		double f = sc.nextDouble();
		
		double c = 5/9 * (f - 32);
		
		System.out.println("Celsius: "+c);
	}
}
