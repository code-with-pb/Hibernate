package Pattern_Triangle;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=6;
		for(i=0;i<n;i++) {
			
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			int s = 2 * (n-i);
			for(j=0;j<s;j++) {
				System.out.print(" ");
			}
			
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(i=n;i>0;i--) {
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}