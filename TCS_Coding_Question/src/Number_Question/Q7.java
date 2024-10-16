package Number_Question;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		if(n == 0) {
			System.out.print(0);
		}
		else {
			int sl = 0;
			int l = 1;
			System.out.print(sl+" "+l+" ");
			for(int i=2;i<=n;i++) {
				int s = l + sl;
				sl = l;
				l = s;
				System.out.print(s+" ");
			}
		}
		
		
	}

}
