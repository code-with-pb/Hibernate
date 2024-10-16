package Number_Question;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 28;
		int i=1;
		int s=0;
		while(i<n) {
			if(n % i == 0) {
				s = s + i;
			}
			i++;
		}
		if(s == n) {
			System.out.println("Perferct");
		}
	}

}
