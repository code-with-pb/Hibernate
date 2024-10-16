package StudentDetail;

public class Student {
	int rollno;
	String Name;
	float marks;
	int yy;
	
	Student(){}

	public Student(int rollno, String name, float marks, int yy) {
		super();
		this.rollno = rollno;
		Name = name;
		this.marks = marks;
		this.yy = yy;
	}

	@Override
	public String toString() {
		return "Student [rollno = " + rollno + ", Name = " + Name + ", marks = " + marks + ", yy = " + yy + "]";
	}
	
	
}
