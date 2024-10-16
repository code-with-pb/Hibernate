package EmpDetail;

public class Employee {
	int id;
	String nm;
	double sal;
	
	public Employee() {}

	public Employee(int id, String nm, double sal) {
		super();
		this.id = id;
		this.nm = nm;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", nm=" + nm + ", sal=" + sal + "]";
	}
	
	
}
