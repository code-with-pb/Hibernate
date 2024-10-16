package WCT20_CoreJavaProject;

import java.util.*;

public class PlayerController {

	public static List<PlayerDao> createData() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many data You Want to Add: ");
		int d = sc.nextInt();
		List<PlayerDao> ls= new LinkedList<>();
		
		if(d != 0) {
			System.out.print("Enter Player id: ");
			int id = sc.nextInt();
			System.out.print("Enter Player Name: ");
			String nm = sc.next();
			System.out.print("Enter Team Name: ");
			String tnm = sc.next();
			System.out.print("Enter Category: ");
			String cat = sc.next();
			System.out.print("Enter Score: ");
			int s = sc.nextInt();
			System.out.println("Enter No of Wickets: ");
			int w = sc.nextInt();
			
			
			for(int i=0;i<d;i++) {
				
				ls.add(new PlayerDao(id,nm,tnm,cat,s,w));
			}
		}
		else {
			System.out.println("Ok..");
		}
		
		return ls;
		
	}
	
}
