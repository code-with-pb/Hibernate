package Question1;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2520;
		int t = n;
		
		while(t > 0) {
			
			//System.out.println(n);
			int i = 2;
			while(i<11) {
				if(n % i != 0) {
					continue;
				}
				else {
					System.out.println(t);
					
				}
				i++;
				break;
			}
		}
	}

}
