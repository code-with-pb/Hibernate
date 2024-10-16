package Pattern_Triangle;

public class Q21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		for(int i=0;i<=6;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n;i>=0;i--) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
