package Abract_KeyWord;

public class B1 extends A1{
	String nm;
	int m;
	public void add(String nm,int m) {
		this.nm = nm;
		this.m = m;
	}
	public void show(int id) {
		System.out.println("id "+id+" name "+nm+" marks "+m);
	}
}
