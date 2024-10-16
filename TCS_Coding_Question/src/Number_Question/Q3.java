package Number_Question;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		
		int t = n/2;
		int c=1;
		
		for(int i=2;i<=t;i++) {
			if(n % i == 0) {
				System.out.println(n/i);
				c++;
			}
		}
		if(c < 2) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
