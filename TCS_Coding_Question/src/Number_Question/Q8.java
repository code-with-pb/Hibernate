package Number_Question;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10,j = 150;
		for(int n=i;n<=j;n++) {
			int t = n/2;
			int c = 1;
			
			for(int s = 2;s<=t;s++) {
				if(n % s == 0) {
					c++;
				}
			}
			if(c < 2) {
				System.out.println(n);
			}
		}
	}

}
