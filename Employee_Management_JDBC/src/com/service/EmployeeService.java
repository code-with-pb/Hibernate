package com.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.doa.EmployeeDao;
import com.employeedb.Employees;

public class EmployeeService {
	
	static EmployeeDao ed = new EmployeeDao();
	
	public static String addEmployee(){
		
		Date now = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyMMdd");
	    String datetime = ft.format(now);
		
		return ed.addEmployee(datetime);
		
	}
}
