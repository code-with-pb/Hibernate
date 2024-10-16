package Pattern_Triangle;

public class Q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			int s = 2*(n-i);
			for(int j=0;j<s;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			int s = 2*(n-i);
			for(int j=0;j<s;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
