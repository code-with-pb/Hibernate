package Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
	static Scanner sc = new Scanner(System.in);
	public static List<Student> Insert() {
		// TODO Auto-generated method stub
		
		System.out.print("How much data you want to enter: ");
		int n = sc.nextInt();
		
		List<Student> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter Student Id: ");
			int id = sc.nextInt();
			System.out.print("Enter Student First Name: ");
			String fnm = sc.next();
			System.out.print("Enter Student Last Name: ");
			String lnm = sc.next();
			System.out.print("Enter Student DOB: ");
			String dob = sc.next();
			System.out.print("Enter Student Mobile No: ");
			String no = sc.next();
			System.out.print("Enter Student Fees: ");
			double fee = sc.nextDouble();
			
			list.add(new Student(id,fnm,lnm,dob,no,fee));
		}
		
		return list;
	}
	public static List<Student> UpdateById() {
		// TODO Auto-generated method stub
		
		List<Student> list = new ArrayList<>();
		
		System.out.print("Enter Student Id: ");
		int id = sc.nextInt();
		System.out.print("Enter Student First Name: ");
		String fnm = sc.next();
		System.out.print("Enter Student Last Name: ");
		String lnm = sc.next();
		
		list.add(new Student(id,fnm,lnm));
		
		return list;
	}

}
