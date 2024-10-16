package Student_Presenty_Mngt;

public class Student {
	int rollno;
	String Fnm,lnm;
	boolean presenty;
	
	public Student() {}
	
	public Student(int rollno, String fnm, String lnm, boolean presenty) {
		super();
		this.rollno = rollno;
		Fnm = fnm;
		this.lnm = lnm;
		this.presenty = presenty;
	}

	@Override
	public String toString() {
		return "Student [rollno = " + rollno + ", FIrstName = " + Fnm + ", LastName = " + lnm + ", presenty = " + presenty + "]";
	}
	
}
