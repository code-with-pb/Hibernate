package WCT20_CoreJavaProject;

import java.sql.SQLException;
import java.util.List;

public class WCT20Application {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		List<PlayerDao> l = PlayerController.createData();
		
		PlaerServiceToDo.insert(l);
		PlaerServiceToDo.display();
	}

}
