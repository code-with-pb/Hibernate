package Abstract_Class;

public class B1 extends A1{
	int id,m;
	String nm;
	public B1(int id,String nm,int m) {
		this.id = id;
		this.nm = nm;
		this.m = m;
	}
	public void setdata() {
		System.out.println("Enter id: "+id);
		System.out.println("Enter Name: "+nm);
		System.out.println("Enter Marks: "+m);
	}
	public String show() {
		return "[id = "+id+" Name = "+nm+" Marks "+m+"]";
	}
}
