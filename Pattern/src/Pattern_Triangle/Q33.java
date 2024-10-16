package Pattern_Triangle;

public class Q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int s = n/2;
		int st = 1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<s;j++) {
				System.out.print("  ");
			}
			for(int j=0;j<st;j++) {
				System.out.print("* ");
			}
			System.out.println();
			if(i < n/2) {
				s--;
				st+=2;
			}
			else {
				s++;
				st-=2;
			}
		}
	}

}
