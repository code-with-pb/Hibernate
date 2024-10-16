package com.Employee;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperationEmployee oe = new OperationEmployee();
		
		Employee emp1 = new Employee(1,"Akash", 30, "IT");
		Employee emp2 = new Employee(2,"Rohit", 21, "E&TC");
		Employee emp3 = new Employee(3,"Sumit", 28, "IT");
		Employee emp4 = new Employee(4,"Kakashi", 27, "IT");
		Employee emp5 = new Employee(5,"Gojo", 29, "IT");
		
		System.out.println("************All Data**********");
		String employee1 = oe.addEmployee(emp1);
		String employee2 = oe.addEmployee(emp2);
		String employee3 = oe.addEmployee(emp3);
		String employee4 = oe.addEmployee(emp4);
		String employee5 = oe.addEmployee(emp5);
		
		List<Employee> employees = oe.getEmployees();
		
		for(Employee emp : employees ) {
			System.out.println(emp);
		}
		
		System.out.println("************Specific Dept Data**********");
		
		List<Employee> employeeByDept = oe.getEmployeeByDept("IT");
		
		for (Employee employee : employeeByDept) {
			System.out.println(employee);
		}
		
		System.out.println("************Specific age Data**********");
		
		List<Employee> employeeByAge = oe.getEmployeeByAge(27);
		
		for (Employee employee : employeeByAge) {
			System.out.println(employee);
		}
	}

}
