package Jdbc2;

public class Student {
	int id;
	String name;
	float per;
	
	Student(){

	}
	
	public Student(int id, String name, float per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
}
