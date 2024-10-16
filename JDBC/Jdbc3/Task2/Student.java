package Task2;

public class Student implements Comparable<Student>{
	int id;
	String fnm;
	String lnm;
	String dob;
	String No;
	double fees;
	
	Student(){}

	public Student(int id, String fnm, String lnm, String dob, String no, double fees) {
		super();
		this.id = id;
		this.fnm = fnm;
		this.lnm = lnm;
		this.dob = dob;
		No = no;
		this.fees = fees;
	}

	public Student(int id2, String fnm2, String lnm2) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.fnm = fnm;
		this.lnm = lnm;
	}

	@Override
	public String toString() {
		return "Student [Id = " + id + ", First_Name = " + fnm + ", Last_Name = " + lnm + ", DOB = " + dob + ", Mobile_No = " + No + ", Fees = " + fees
				+ "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (int) (this.id - o.id);
	}
	
}
