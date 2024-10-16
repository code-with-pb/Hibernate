package Pattern_Number_Triangle;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		
		int o = 0,p = 1;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				
				if((i+j) % 2 != 0) {
					System.out.print(o+" ");
				}
				else {
					System.out.print(p+" ");
				}
			}
			System.out.println();
		}
	}

}
