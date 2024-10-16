package Pattern_Triangle;

public class Q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print("  ");
			}
			int j = 0;
			/*if(j == 0 && j<=i) {
				System.out.print("* ");
			}*/
			for(j=0;j<2*i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
