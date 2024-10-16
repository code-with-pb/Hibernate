package Task1;

import java.util.*;

public class CrudOP1Controller {
	static Scanner sc = new Scanner(System.in);
	public static List<CRUD> getData() {
		// TODO Auto-generated method stub
		List<CRUD> list = new ArrayList<>();
		
		System.out.print("Enter How much detail you want to add: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter Student Id: ");
			int id = sc.nextInt();
			System.out.print("Enter Student Name: ");
			String name = sc.next();
			System.out.print("Enter Student Marks: ");
			float marks = sc.nextFloat();
			System.out.print("Enter Student Year: ");
			int year = sc.nextInt();
			
			list.add(new CRUD(id,name,marks,year));
		}
		return list;
	}

	public static List<CRUD> UpdateNameById() {
		// TODO Auto-generated method stub
		List<CRUD> list = new ArrayList<>();
		
		System.out.print("Enter How Many detail you want to Update: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter Id: ");
			int id = sc.nextInt();
			System.out.print("Update Name: ");
			String name = sc.next();
			
		}
		
		return list;
	}

	public static List<CRUD> UpdateNameMarksById() {
		// TODO Auto-generated method stub
		
		List<CRUD> list = new ArrayList<>();
		
		System.out.print("Enter How many detail you want to Update: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter Id: ");
			int id = sc.nextInt();
			System.out.print("Update Name: ");
			String name = sc.next();
			System.out.print("Update Marks: ");
			float Marks = sc.nextFloat();
			
			list.add(new CRUD(id,name,Marks));
		}
		return list;
	}

	public static List<CRUD> DeleteById() {
		// TODO Auto-generated method stub
		List<CRUD> list = new ArrayList<>();
		System.out.print("Enter How many detail you want to delete: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter Id: ");
			int id = sc.nextInt();
			
			list.add(new CRUD(id));
		}
		
		return list;
	}

	public static int DisplayById() {
		// TODO Auto-generated method stub
		
		
		System.out.print("Enter Id: ");
		int id = sc.nextInt();
		
		
		
		return id;
	}

	public static float DisplayBetweenRange() {
		// TODO Auto-generated method stub
		
		System.out.print("Enter Mark1: ");
		float mark = sc.nextFloat();
		
		return mark;
	}

}
