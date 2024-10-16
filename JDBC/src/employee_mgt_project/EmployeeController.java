package employee_mgt_project;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {
	public static List<Employee> createEmployeeData() {
		System.out.println("createEmployeeData starts..");

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(444, "Ramesh", "DEV", 88000));
		empList.add(new Employee(555, "Suresh", "TESTER", 67000));
		empList.add(new Employee(666, "Suresh", "DEV", 67000));
		System.out.println("createEmployeeData ends..");
		return empList;
	}
}
