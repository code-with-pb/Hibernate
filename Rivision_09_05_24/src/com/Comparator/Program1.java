package com.Comparator;

import java.util.Comparator;

public class Program1{
	int id;
	String nm;
	double sal;
	
	public Program1(int id, String nm, double sal) {
		super();
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.nm = nm;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Program1 [id=" + id + ", nm=" + nm + ", sal=" + sal + "]";
	}

}
