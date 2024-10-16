package com.Comparable;

public class Program1 implements Comparable<Program1>{
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

	/*@Override
	public int compareTo(Program1 o) {
		// TODO Auto-generated method stub
		return (this.id - o.id) * -1;
	}*/
	
	/*public int compareTo(Program1 o) {
		// TODO Auto-generated method stub
		return this.nm.compareTo(o.nm);
	}*/
	
	public int compareTo(Program1 o) {
		// TODO Auto-generated method stub
		return (int) (this.sal - o.sal);
	}
	
}
