package Number_Question;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10,m=100;
		
		
		
		
		for(int i=n;i<=m;i++) {
			int t = n/2;
			int c=1;
			
			for(int j=2;j<=t;j++) {
				if(i % j == 0) {
					//System.out.println(i/j);
					c++;
				}
			}
			if(c<2) {
				System.out.println(i);
			}
		}
	}

}
