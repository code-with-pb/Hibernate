package EmpDetail;

import java.sql.SQLException;
import java.util.List;

public class EmpApplication {
	public static void main(String args[]) throws SQLException {
		
		List<Employee> elist = EmpController.CreateEmpData();
		
		//EmpServiceToDo.insert(elist);
		
		EmpServiceToDo.update();
		
		EmpServiceToDo.Display();
	}
}
