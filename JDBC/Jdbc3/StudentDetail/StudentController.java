package StudentDetail;

import java.util.*;

public class StudentController {

	public static List<Student> getData() {
		// TODO Auto-generated method stub
		List<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Detail You Want to Add: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter RollNo: ");
			int id = sc.nextInt();
			System.out.println();
			System.out.print("Enter Name: ");
			String nm = sc.next();
			System.out.println();
			System.out.print("Enter Marks: ");
			float mk = sc.nextFloat();
			System.out.println();
			System.out.print("Enter Year: ");
			int yr = sc.nextInt();
			
			list.add(new Student(id,nm,mk,yr));
			
			
		}
		return list;
	}

}
