package EmpDetail;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class EmpController {

	public static List<Employee> CreateEmpData() {
		// TODO Auto-generated method stub
		System.out.println("Creating Emp Data");
		
		List<Employee> elist = new ArrayList<>();
		System.out.println("Add Detail...");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter count of Emp: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("Enter Emp id: ");
			int id = sc.nextInt();
			System.out.print("Enter Emp Name: ");
			String nm = sc.next();
			System.out.print("Enter Emp Salary: ");
			double sal = sc.nextDouble();
			
			Employee ee = new Employee(id, nm, sal);
			elist.add(ee);
		}
		
		return elist;
	}

}
