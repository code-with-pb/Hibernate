package Pattern_Number_Triangle;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,n=5;
		int c = 1;
		for(i = 0;i<n;i++) {
			for(j=n-1;j>=i;j--) {
				System.out.print("  ");
			}
			
			for(j=0;j<=i;j++) {
				System.out.print(c+"  ");
				
			}
			c++;
			System.out.println();
		}
	}

}
