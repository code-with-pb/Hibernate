package com.employeedb;

public class Employees {
	long EmployeeID;
	String FirstName;
	String LastName;
	String Department;
	String JobTitle;
	double salary;
	String HireDate;
	public Employees(){}
	public Employees(long employeeID, String firstName, String lastName, String department, String jobTitle,
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
	
	public Employees(String firstName, String lastName, String department, String jobTitle, double salary,
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
