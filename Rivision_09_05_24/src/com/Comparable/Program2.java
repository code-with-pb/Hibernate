package com.Comparable;

public class Program2 implements Comparable<Program2>{
	int id;
	String name;
	
	Program2(){}

	public Program2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Program2 [id = " + id + ", name = " + name + "]";
	}

	@Override
	public int compareTo(Program2 o) {
		// TODO Auto-generated method stub
		return (int)(this.id - o.id);
	}

}
