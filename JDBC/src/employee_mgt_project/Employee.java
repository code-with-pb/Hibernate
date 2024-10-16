package employee_mgt_project;

public class Employee {
	int emp_id;
	String name;
	String role;
	double salary;
	
	public Employee() {
	}

	public Employee(int emp_id, String name, String role, double salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
}
