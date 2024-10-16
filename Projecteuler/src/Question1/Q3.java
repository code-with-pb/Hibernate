package Question1;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long n = 600851475;
		int n = 13195;
		//long s = 600851475143;
		int i = (int)n/2;
		
		for(int j=2;j<=i;j++) {
			if(n % j == 0) {
				System.out.println(j+" ");
			}
		}
	}

}
