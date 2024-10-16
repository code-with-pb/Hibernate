package Number_Question;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int t = n;
		int p =0;
		int i = String.valueOf(n).length();
		
		while(t != 0) {
			int d = t % 10;
			//r = (r*10) + d;
			t = t/10;

			int j =0;
			int s = 1;
			while(j != i) {
				s = s * d;
				j++;
			}
			p = p + s;

		}
		if(p == n) {
			System.out.println("Yes");
		}
	}

}
