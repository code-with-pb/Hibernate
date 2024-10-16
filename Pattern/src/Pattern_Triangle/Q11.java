package Pattern_Triangle;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n=5;
		
		for(i=0;i<n;i++) {
			for(j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=n;i>1;i--) {
			for(j=1;j<n-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
