package Number_Question;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 811;
		
		int t = n;
		int r = 0;
		int k=0;
		
		while(t>0) {
			int m = t % 10;
			r = (r *10)+m;
			t = t / 10;
		}
		if(r == n) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
