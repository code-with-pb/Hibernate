package Jdbc2;

import java.util.ArrayList;
import java.util.List;

public class StudentController {

	public static List<Student> createStudentData() {
		List<Student> slist = new ArrayList<>();
		
		slist.add(new Student(18,"Sid",56.36f));
		
		return slist;
		
	}

}
