package Pattern_Triangle;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			int t = 2 * (6-i);
			for(int j=0;j<t;j++) {
				System.err.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=6;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			
			int s = 2 * (6-i);
			for(int j=0;j<s;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
