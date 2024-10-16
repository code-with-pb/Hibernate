package Task2;
import java.sql.*;
import java.util.*;


public class Application {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		List<Student> list1 = Controller.Insert();
		List<Student> list2 = Controller.UpdateById();
		
		ServiceToDo.Insert(list1);
		
		ServiceToDo.UpdateById(list2);
	
		ServiceToDo.DisplayAll();
	}

}
