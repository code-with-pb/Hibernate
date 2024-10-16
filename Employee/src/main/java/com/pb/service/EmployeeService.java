package com.pb.service;

import java.util.List;

import com.pb.dao.EmployeeDao;
import com.pb.entity.Employee;
import com.pb.utility.PrepareData;

public class EmployeeService {
	
	static EmployeeDao ed = new EmployeeDao();
	
	public static String addEmployee(Employee emp) {
		return ed.addEmployee(emp);
	}
	public static List<Employee> showEmployee(){
		return ed.showEmployee();
	}
}
