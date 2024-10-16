package com.Employee;
import java.util.*;

public class OperationEmployee {
	private List<Employee> list = new ArrayList<>();
	public String addEmployee(Employee e) {
		
		list.add(e);
		
		return "Added SuccessFully...";
	}
	public List<Employee> getEmployees(){
		
		return list;
	}
	public List<Employee> getEmployeeByDept(String dept){
		
		List<Employee> deptlist = new ArrayList<>();
		
		for (Employee employee : list) {
			if(employee.getDeprtment().equals(dept)) {
				deptlist.add(employee);
			}
		}
		return deptlist;
	}
	public List<Employee> getEmployeeByAge(int age){
		
		List<Employee> agelist = new ArrayList<>();
		
		for (Employee employee : list) {
			
			if(employee.getAge() >= age) {
				agelist.add(employee);
			}
		}
		return agelist;
	}
}
