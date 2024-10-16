package com.ComparableTest;

import java.util.*;

import com.Comparable.Program1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com.Comparable.Program1 p1 = new com.Comparable.Program1(101, "Akash", 700000);
		
		com.Comparable.Program1 p2 = new com.Comparable.Program1(102, "Akshay", 600000);
		
		com.Comparable.Program1 p3 = new com.Comparable.Program1(103, "Hrishikesh", 70000);
		
		com.Comparable.Program1 p4 = new com.Comparable.Program1(104, "Pravin", 60000);
		
		com.Comparable.Program1 p5 = new com.Comparable.Program1(105, "Pratiksha", 100000);
		
		com.Comparable.Program1 p6 = new com.Comparable.Program1(106, "Suksan",170000);
		
		ArrayList<Program1> a = new ArrayList<Program1>();
		
		a.add(p1);
		
		a.add(p2);
		
		a.add(p3);
		
		a.add(p4);
		
		a.add(p5);
		
		a.add(p6);

		Collections.sort(a);
		
		for(Program1 p : a) {
			System.out.println(p);
		}
	}

}
