package CrudOp;

import java.util.*;
import java.sql.*;

public class CrudApplication {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		List<CrudOp1> list = CrudController.getData();
		
		ServiceToDo.insert(list);
		
		ServiceToDo.update();
		
		ServiceToDo.delete();
		
		ServiceToDo.display();
	}

}
