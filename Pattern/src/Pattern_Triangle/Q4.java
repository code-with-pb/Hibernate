package Pattern_Triangle;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		
		for(i = 0;i<n;i++) {
			for(int k=n-1;k>=i;k--) {
				System.out.print("  ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
