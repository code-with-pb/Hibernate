package com.controller;

import com.employeedb.Employees;
import com.employeedetail.PrepareData;
import com.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService es = new EmployeeService();
		
		PrepareData pd = new PrepareData();
		
		Employees ed = new Employees();
		
		pd.addEmployee(ed);
		
		String s = es.addEmployee();
		
		System.out.println(s);
	}

}
