package Pattern_Number_Triangle;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		int c = 1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(c+" ");
				c++;
				
			}
			System.out.println();
		}
	}

}
