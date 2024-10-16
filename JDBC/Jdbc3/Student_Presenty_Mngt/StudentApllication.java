package Student_Presenty_Mngt;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StudentApllication {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		List<Student> slist = StudentController.CreateStudentData();
		
		//StudentServiceToDo.insertData(slist);
		
		StudentServiceToDo.display();
	}

}
