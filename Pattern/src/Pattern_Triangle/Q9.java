package Pattern_Triangle;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5,i,j;
		
		for(i=0;i<n;i++) {
			for(j=0;j<i;j++) {
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
