package Task1;
import java.util.*;
import java.sql.*;

public class CrudOP1Application {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Enter how many time Opteration you want to Performed: ");
		int n = sc.nextInt();*/
		int s;
		do {
			System.out.print("Enter Which operation performed: ");
			System.out.println("1) Insert 2)UpdateNameById 3)UpdateNameMarksById 4)DeleteById 5)DisplayById 6)DisplayRangeRecord 7)DisplayAllRecord 8)Exit");
			s = sc.nextInt();
			
			
				switch(s) {
					case 1:
						List<CRUD> list1 = CrudOP1Controller.getData();
						ServiceToDo.insert(list1);
						break;
					case 2:
						List<CRUD> list2 = CrudOP1Controller.UpdateNameById();
						ServiceToDo.UpdateNameById(list2);
						break;
					case 3:
						List<CRUD> list3 = CrudOP1Controller.UpdateNameMarksById();
						ServiceToDo.UpdateNameMarksById(list3);
						break;
					case 4:
						List<CRUD> list4 = CrudOP1Controller.DeleteById();
						ServiceToDo.DeleteById(list4);
						break;
					case 5:
						int c = CrudOP1Controller.DisplayById();
						ServiceToDo.DisplayById(c);
						break;
					case 6:
						float mark = CrudOP1Controller.DisplayBetweenRange();
						ServiceToDo.DisplayRangeRecord(mark);
						break;
					case 7:
						ServiceToDo.DisplayAllRecord();
						break;
					default :
						System.out.print("Invalid Input....");
						break;
				}
			}
		while(s != 8);
			
		
	}

}
