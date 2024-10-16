package CrudOp;

import java.util.*;

public class CrudController {

	public static List<CrudOp1> getData() {
		// TODO Auto-generated method stub
		
		List<CrudOp1> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Detail You Want to Add: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter Id: ");
			int id = sc.nextInt();
			System.out.println();
			System.out.print("Enter Name: ");
			String nm = sc.next();
			System.out.println();
			System.out.print("Enter Marks: ");
			float m = sc.nextFloat();
			System.out.println();
			System.out.print("Enter Year: ");
			int yy = sc.nextInt();
			
			list.add(new CrudOp1(id,nm,m,yy));
			
		}
		
		return list;
	}

}
