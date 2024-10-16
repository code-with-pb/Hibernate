package com.pb.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pb.config.HibernateConfig;
import com.pb.entity.Employee;
import com.pb.utility.PrepareData;

public class EmployeeDao {
	 SessionFactory sf = HibernateConfig.getSessionFactory();
	
	 Session sn = sf.openSession();
	 Transaction tx;
	 Employee emp;
	public  String addEmployee(Employee emp) {
		/*
		SessionFactory sf = HibernateConfig.getSessionFactory();
		
		Session sn = sf.openSession();*/
		
		tx = sn.beginTransaction();
		sn.save(emp);
		tx.commit();
		
		sn.close();
		
		return "Data Inserted...";
	}
	public  Object showEmployee(){
		tx = sn.beginTransaction();
		
		emp = sn.get(Employee.class, EmployeeID);
		
		return emp;
	}
}
