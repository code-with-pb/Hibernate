package Pattern_Square;

public class Q2 {
	public static void p() {
		int i,j,n=5;
		
		for(i = 0; i< n; i++) {
			for(j=0;j<n;j++) {
				if(j == 0 || i == 0 || j == n-1 || i == n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p();
	}

}
