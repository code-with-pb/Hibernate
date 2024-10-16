package Pattern_Number_Triangle;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,n=5;
		
		for(i=1;i<=n;i++) {
			for(k=n-1;k>=i;k--) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
