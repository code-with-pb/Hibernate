package com.employeedetail;
import java.util.*;
import com.employeedb.Employees;

public class PrepareData {
	
	static Scanner sc = new Scanner(System.in);
	static Employees ed = new Employees();
	
	public static Object addEmployee(Employees em) {

		System.out.print("Enter FirstName: ");
		ed.setFirstName(sc.next());
		
		System.out.print("Enter LastName: ");
		ed.setLastName(sc.next());
		
		System.out.print("Enter Department: ");
		ed.setDepartment(sc.next());
		
		System.out.print("Enter JobTitle: ");
		ed.setJobTitle(sc.next());
		
		System.out.print("Enter Salary: ");
		ed.setSalary(sc.nextDouble());
		
		System.out.print("Enter HireDate: ");
		ed.setHireDate(sc.next());
		

		
		return em;
	}
}
