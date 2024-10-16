package Student_Presenty_Mngt;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

	

	public static List<Student> CreateStudentData(){
		
		System.out.println("Create SudentData Starts....");
		
		List<Student> slist = new ArrayList<>();
		
		slist.add(new Student(1,"Akash","Pawar",true));
		slist.add(new Student(2,"Hrishikesh","Pawar",true));
		slist.add(new Student(3,"Shivani","Kapile",true));
		slist.add(new Student(4,"Sakshi","Babar",true));
		slist.add(new Student(5,"Akash","Kengar",false));
		slist.add(new Student(6,"Pravin","Bhosale",false));
		
		return slist;

		

	}

}
