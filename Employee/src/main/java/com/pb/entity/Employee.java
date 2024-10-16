package com.pb.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	@Column(name = "EmployeeID",unique = true, nullable = false)
	long EmployeeID;
	
	@Column(name = "FirstName",nullable = false)
	String FirstName;
	
	@Column(name = "LastName",nullable = false)
	String LastName;
	
	@Column(name = "Department",nullable = false)
	String Department;
	
	@Column(name = "JobTitle",nullable = false)
	String JobTitle;
	
	@Column(name = "Salary",nullable = false)
	double salary;
	
	@Column(name = "HireDate",nullable = false)
	String HireDate;
	
	
	public Employee(){}
	
	public Employee(long employeeID, String firstName, String lastName, String department, String jobTitle,
			double salary, String hireDate) {
		super();
		EmployeeID = employeeID;
		FirstName = firstName;
		LastName = lastName;
		Department = department;
		JobTitle = jobTitle;
		this.salary = salary;
		HireDate = hireDate;
	}
	
	public Employee(String firstName, String lastName, String department, String jobTitle, double salary,
			String hireDate) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Department = department;
		JobTitle = jobTitle;
		this.salary = salary;
		HireDate = hireDate;
	}
	
	@Override
	public String toString() {
		return "Employees [EmployeeID=" + EmployeeID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", Department=" + Department + ", JobTitle=" + JobTitle + ", salary=" + salary + ", HireDate="
				+ HireDate + "]";
	}
	
	public long getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getJobTitle() {
		return JobTitle;
	}
	public void setJobTitle(String jobTitle) {
		JobTitle = jobTitle;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getHireDate() {
		return HireDate;
	}
	public void setHireDate(String hireDate) {
		HireDate = hireDate;
	}
	
}
