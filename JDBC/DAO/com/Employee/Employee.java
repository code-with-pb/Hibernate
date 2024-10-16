package com.Employee;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String deprtment;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, int age, String deprtment) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.deprtment = deprtment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDeprtment() {
		return deprtment;
	}

	public void setDeprtment(String deprtment) {
		this.deprtment = deprtment;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", deprtment=" + deprtment + "]";
	}
	
}
