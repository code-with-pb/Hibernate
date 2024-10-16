package Pattern_Triangle;

public class Q29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		for(int i=n;i>=1;i--) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			int s = (2*i)-1;
			for(int j=1;j<=s;j++) {
				if(j == 1 || i == n || j == s) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
