package StudentDetail;

import java.sql.*;
import java.util.*;

import Student_Presenty_Mngt.StudentServiceToDo;

public class StudentApplication {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		List<Student> list = StudentController.getData();
		
		ServiceToDo.display();
	}

}
