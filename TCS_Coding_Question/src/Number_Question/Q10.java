package Number_Question;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 28;
		
		int t = n;
		int p =0;
		for(int i=1;i<=n/2;i++) {
			if(n % i == 0) {
				p = p+i;
			}
		}
		if(p == n) {
			System.out.println("ture");
		}
	}

}
