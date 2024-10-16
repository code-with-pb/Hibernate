package com.pb.controller;

import org.hibernate.SessionFactory;

import com.pb.config.HibernateConfig;
import com.pb.entity.Employee;
import com.pb.service.EmployeeService;
import com.pb.utility.PrepareData;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService es = new EmployeeService();
		Employee emp = new Employee();
		Object obj;
		
		obj = PrepareData.getData(emp);
		
		String sql = es.addEmployee(emp);
		
		System.out.println(sql);
		
		System.out.println("Done");
	}
}
