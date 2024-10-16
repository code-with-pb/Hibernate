package com.pb.utility;

import java.util.Scanner;

import com.pb.entity.Employee;

public class PrepareData {
	
	static Employee emp = new Employee();
	static Scanner sc = new Scanner(System.in);
	
	public static Object getData(Employee em) {
		System.out.print("Enter EmployeeId: ");
		em.setEmployeeID(sc.nextInt());
		
		System.out.print("Enter EmployeeFirstName: ");
		em.setFirstName(sc.next());
		
		System.out.print("Enter EmployeeLastName: ");
		em.setLastName(sc.next());
		
		System.out.print("Enter EmployeeDepartment: ");
		em.setDepartment(sc.next());
		
		System.out.print("Enter EmployeeJobTitle: ");
		em.setJobTitle(sc.next());
		
		System.out.print("Enter EmployeeSalary: ");
		em.setSalary(sc.nextDouble());
		
		System.out.print("Enter EmployeeHireDate: ");
		em.setHireDate(sc.next());
		
		return em;
	}
}
