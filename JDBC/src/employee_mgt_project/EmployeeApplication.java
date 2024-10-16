package employee_mgt_project;

import java.util.List;

public class EmployeeApplication {

	public static void main(String[] args) {
		
		// create data
				List<Employee> empList = EmployeeController.createEmployeeData();

				// insert to database
				EmpServiceToDao.insertData(empList);
				
				// send to MumbaiProduction whose are Developers
				EmpServiceToDao.insertData(empList);
				
				// send to Pune Production whose are Tester
				EmpServiceToDao.insertData(empList);

				// update
				EmpServiceToDao.updateData();

				// delete
				EmpServiceToDao.deleteData();

				// display
				EmpServiceToDao.displayData();
	}

}
