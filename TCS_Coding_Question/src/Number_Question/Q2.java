package Number_Question;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10,m = 150;
		
		for(int i=n;i<=m;i++) {
			int t = i;
			int r = 0;
			while(t>0) {
				int d = t % 10;
				r = (r*10)+d;
				t = t /10;
			}
			if(r == i) {
				System.out.println(i);
			}
		}
		
	}

}
