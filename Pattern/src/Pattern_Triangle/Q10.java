package Pattern_Triangle;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		
		for(i=0;i<n;i++) {
			for(j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=n;i>0;i--) {
			for(j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
