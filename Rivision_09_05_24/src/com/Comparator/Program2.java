package com.Comparator;

public class Program2 {
	int id;
	String name;
	
	Program2(){}

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

	public Program2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Program2 [id=" + id + ", name=" + name + "]";
	}
	
}
