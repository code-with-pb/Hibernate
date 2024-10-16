package Jdbc2;

import java.util.List;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> slist = StudentController.createStudentData();
		
		/*StudentServiceToDo.insertData(slist);
		
		StudentServiceToDo.updateData();
		
		StudentServiceToDo.deleteData();*/
		
		StudentServiceToDo.displayData();
	}

}
